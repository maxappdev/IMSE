package com.example.demo.security;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;

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
  protected void configure(HttpSecurity http) throws Exception
  {
    http.
        httpBasic().and()
        .authorizeRequests().antMatchers("/**").hasRole("ADMIN").and()
        .csrf().disable().headers().frameOptions().disable();
  }
}
