package com.tamingthymeleaf.tamingthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String index(Model model) {
        return "users/list";
    }

}
