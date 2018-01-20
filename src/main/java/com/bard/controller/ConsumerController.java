package com.bard.controller;

import com.bard.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        int a=222;
        int b=666;
        int c=333;
        int qqqqq=6789;
        int bbbbb=6789;
        int d=888;
        return computeClient.add(10, 20);
    }

}