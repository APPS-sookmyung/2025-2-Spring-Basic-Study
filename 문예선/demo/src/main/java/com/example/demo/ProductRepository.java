package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {
    @Autowired
    private ProductRepository pr;
    public String getProduct(){
        return "노트북!";
    }
}
