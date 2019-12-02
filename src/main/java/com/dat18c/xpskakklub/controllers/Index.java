package com.dat18c.xpskakklub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    //index page. (all access)
    @GetMapping("/")
    public String showIndexPage(){
        return "/index";
    }


}
