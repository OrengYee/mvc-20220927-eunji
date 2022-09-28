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

    @GetMapping("/test2")
    public String test2() {
        System.out.println("test2");
        return "test/test_page2";
    }

    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute(atti)
        model.addAttribute(att:"name", name);
        return "test/test_page3";
    }
}
