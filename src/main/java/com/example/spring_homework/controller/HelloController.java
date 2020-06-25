package com.example.spring_homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "Anonymous") String name) {
        model.addAttribute("name", name);
        return "index";
    }
}
