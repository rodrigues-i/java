package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

  @GetMapping(path = { "/ola", "/saudacao" })
  public String olar() {
    return "Olá Spring Boot";
  }

  @GetMapping(path = { "/saudacao" })
  public String saudar() {
    return "Olá Spring Boot";
  }
}
