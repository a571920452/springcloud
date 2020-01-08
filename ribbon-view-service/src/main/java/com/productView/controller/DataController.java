package com.productView.controller;

import com.productView.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/products")
    public Object list(){
        return dataService.listProducts();
    }
}
