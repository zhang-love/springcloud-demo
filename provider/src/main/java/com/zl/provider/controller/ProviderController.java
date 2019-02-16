package com.zl.provider.controller;

import com.netflix.discovery.converters.Auto;
import com.zl.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    ProviderService providerService;


    @RequestMapping("/provide")
    public String provide(@RequestParam String name){
        String provide = providerService.provide(name);
        return provide;
    }
}
