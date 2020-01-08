package com.feign.controller;

import com.feign.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private DataService dataService;

    @GetMapping("/feign")
    public Object productList(){
        return dataService.listProdcuts();
    }
}
