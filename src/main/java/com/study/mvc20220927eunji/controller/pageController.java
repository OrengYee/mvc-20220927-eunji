package com.study.mvc20220927eunji.controller;

import org.springframework.core.Conventions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.model.IAttribute;

@Controller
public class pageController {

    @GetMapping("/test1")
    public String test1() {
        return "test_page1";
    }
}







