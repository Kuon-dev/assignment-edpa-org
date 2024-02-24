package com.edpa.controller;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Import Model
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("/hello")
  public String hello(Model model) { // Add Model as parameter
    return "hello"; // Return the name of the JSP page
  }
}
