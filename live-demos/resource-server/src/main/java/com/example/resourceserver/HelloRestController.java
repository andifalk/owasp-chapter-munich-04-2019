package com.example.resourceserver;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloRestController {

  @PreAuthorize("hasAnyAuthority('SCOPE_user', 'SCOPE_admin')")
  @GetMapping("/hello-user")
  String helloUser(@AuthenticationPrincipal Principal principal) {
    return "Hello to user '" + principal.getName() + "'";
  }

  @PreAuthorize("hasAuthority('SCOPE_admin')")
  @GetMapping("/hello-admin")
  String helloAdmin(@AuthenticationPrincipal Principal principal) {
    return "Hello to administrator '" + principal.getName() + "'";
  }
}
