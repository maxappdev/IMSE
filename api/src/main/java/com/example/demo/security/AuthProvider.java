package com.example.demo.security;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.*;
import org.springframework.stereotype.*;

/*
https://stackoverflow.com/questions/46124028/spring-boot-security-rest-basic-authentication-from-database //TODO citate
 */
@Component
public class AuthProvider implements AuthenticationProvider {

  @Autowired
  private AdminRepository adminRepository;

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {

    String username = authentication.getName();
    String password = authentication.getCredentials().toString();

    Admin admin = adminRepository.findAdminByUsername(username);
    String userRole = admin.getRole().toString();

    List<GrantedAuthority> authorities = new ArrayList<>();
    authorities.add(new SimpleGrantedAuthority(userRole));

    return new UsernamePasswordAuthenticationToken(username, password, authorities);
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return authentication.equals(UsernamePasswordAuthenticationToken.class);
  }
}