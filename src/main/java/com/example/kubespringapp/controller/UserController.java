package com.example.kubespringapp.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return List.of(
                new User("Alice", 30),
                new User("Bob", 40),
                new User("Charlie", 50)
        );
    }

    @Getter
    @AllArgsConstructor
    public static class User {
        private String name;
        private int age;
    }
}
