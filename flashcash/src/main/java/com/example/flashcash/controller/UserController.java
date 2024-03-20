package com.example.flashcash.controller;

import ch.qos.logback.core.model.Model;
import com.example.flashcash.service.form.SignUpForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/signup")
    public ModelAndView showRegisterForm() {
        return new ModelAndView("signup", "signUpForm", new SignUpForm());
    }

    @GetMapping("/index")
    public ModelAndView home(Model model) {
        return new ModelAndView("index");
    }
}


