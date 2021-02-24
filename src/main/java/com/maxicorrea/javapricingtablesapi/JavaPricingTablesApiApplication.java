package com.maxicorrea.javapricingtablesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JavaPricingTablesApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(JavaPricingTablesApiApplication.class, args);
  }

  @RequestMapping("/")
  public final String index() {
    return "OK!";
  }

}
