package com.edpa;

// package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EpdaApplication {

  public static void main(String[] args) {
    SpringApplication.run(EpdaApplication.class, args);
  }

  // @GetMapping("/hello")
  // public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
  //   return String.format("Hello %s!", name);
  // }
  //
  @GetMapping("/display")
  public String display() {
    return "hello";
  }
}
