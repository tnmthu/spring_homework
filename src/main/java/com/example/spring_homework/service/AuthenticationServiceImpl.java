package com.example.spring_homework.service;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public boolean login(String username, String password) {
        String mockUsername = "demo.admin";
        String mockPassword = "123456";
        return (mockUsername == username) && (mockPassword == password);
    }
}
