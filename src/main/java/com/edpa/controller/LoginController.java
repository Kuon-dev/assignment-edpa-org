package com.edpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.context.annotation.Scope;

@Controller
// @RequestMapping(value="/login")
// @Scope(value="session")
public class LoginController {

  @GetMapping("/login")
  public String login() {
    return "login";
  }
}
