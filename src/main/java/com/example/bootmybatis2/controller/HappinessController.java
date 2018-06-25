package com.example.bootmybatis2.controller;

import com.example.bootmybatis2.entity.Happiness;
import com.example.bootmybatis2.service.HappinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class HappinessController {
    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/query")
    public Happiness testQuery(){
        return happinessService.selectService("北京");
    }

    @RequestMapping("/insert")
    public String testInsert(String name){
      return happinessService.insertService(name);
    }
}
