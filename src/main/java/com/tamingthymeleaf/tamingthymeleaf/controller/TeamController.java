package com.tamingthymeleaf.tamingthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/teams")
public class TeamController {

    @GetMapping
    public String index(Model model) {
        return "teams/list";
    }



}
