package com.tedu.spitemservice.controller;

import com.tedu.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ItemService itemService;
    @RequestMapping("/test")
    public String test(){
        return itemService.findItemByOrderId(90L);
    }
}
