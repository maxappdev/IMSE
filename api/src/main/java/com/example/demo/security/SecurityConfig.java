package com.example.demo.security;

import com.example.demo.model.Roles;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.web.servlet.config.annotation.*;

/*
https://stackoverflow.com/questions/46124028/spring-boot-security-rest-basic-authentication-from-database //TODO citate
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

  @Autowired
  private AuthProvider authProvider;

  @Autowired
  public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(authProvider);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/register").permitAll()
        .antMatchers("/**").hasAnyAuthority("ADMIN", "CUSTOMER")
        .anyRequest().authenticated()
        .and()
        .httpBasic()
        .and().cors();

    http.csrf().disable();
  }
}
