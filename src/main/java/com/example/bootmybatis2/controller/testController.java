package com.example.bootmybatis2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testController {

    @RequestMapping("/index")
    public String gotoIndex(){
        return "index";
    }

}
