package com.example.spring_homework.service.impl;

import com.example.spring_homework.constant.MockConstant;
import com.example.spring_homework.service.AuthenticationService;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public boolean login(String username, String password) {
        return (MockConstant.username.equals(username)) && (bCryptPasswordEncoder.matches(password, MockConstant.password));
    }

    @Override
    public String hash() {
        return bCryptPasswordEncoder.encode("12345678");
    }
}
