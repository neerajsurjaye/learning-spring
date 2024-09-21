package com.spec.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
public class HelloWorldController {

    @GetMapping("/showform")
    public String showForm(Model model){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(Model model){
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String processFormV2(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        name = name.toUpperCase();
        model.addAttribute("message" , name);

        return "helloworld";
    }

    @PostMapping("/processFormV3")
    public String processFormV2(@RequestParam("name") String name, Model model){
        name = name.toUpperCase();
        name = name + " : V3";
        model.addAttribute("message" , name);

        return "helloworld";
    }

}
