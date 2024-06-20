package com.lec.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;


@Controller
public class homeController {

    @RequestMapping("/")
    public String now(Model model) {

    LocalDateTime t = LocalDateTime.now();
    model.addAttribute("serverTime", t);


    return "main";
    }

    @RequestMapping("/login")
    public String login(Model model) {

        LocalDateTime t = LocalDateTime.now();
        model.addAttribute("serverTime", t);

        return "login";
    }

    @RequestMapping("/board")
    public String board(Model model) {

        LocalDateTime t = LocalDateTime.now();
        model.addAttribute("serverTime", t);

        return "board";
    }

    @RequestMapping("/post")
    public String post(Model model) {

        LocalDateTime t = LocalDateTime.now();
        model.addAttribute("serverTime", t);

        return "post";
    }


}
