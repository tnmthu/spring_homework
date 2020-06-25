package com.example.spring_homework.controller;

import com.example.spring_homework.dto.LoginDto;
import com.example.spring_homework.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    public AuthenticationService authenticationService;

    @GetMapping
    public String showLoginPage(Model model) {
        HashMap<String, String> response = new HashMap<>();
        response.put("success", "true");
        model.addAttribute("response", response);
        return "login";
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String handleLogin(Model model, LoginDto loginDto) {
        HashMap<String, String> response = new HashMap<>();
        System.out.println(authenticationService);

        if (authenticationService.login(loginDto.getUsername(), loginDto.getPassword())) {
            response.put("success", "true");
            response.put("name", loginDto.getUsername());
        } else {
            response.put("success", "false");
            response.put("msg", "Invalid Credentials");
        }
        System.out.println(response);
        model.addAttribute("response", response);
        return response.get("success").equals("true") ? "dashboard" : "login";
    }
}
