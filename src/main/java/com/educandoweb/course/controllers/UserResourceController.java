package com.educandoweb.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourceController {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(
        1L,
        "Vitor",
        "vitor@email.com",
        "988888888",
        "senhafortedemais");

    return ResponseEntity.ok().body(u);
  }
}
