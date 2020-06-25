package com.example.spring_homework.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface AuthenticationService {
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    boolean login(String username, String password);
    String hash();
}
