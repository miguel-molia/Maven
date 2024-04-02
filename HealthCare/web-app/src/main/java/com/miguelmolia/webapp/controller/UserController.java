package com.miguelmolia.webapp.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/")
    public ModelAndView home(Model model) {
        return new ModelAndView("index");
    }

    @GetMapping("/signup")
    public ModelAndView showRegisterForm() {

        return new ModelAndView("signup", "signUpForm", new com.example.flashcash.service.form.SignUpForm());
    }
}
