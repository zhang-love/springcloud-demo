package com.zl.provider.service;

import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    public String provide(String name){
        return "provide "+ name;
    }
}
