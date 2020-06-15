package com.hua.shi.lufuorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/getOrderNo")
    public String getOrderNo(){

        return "order001";
    }
}
