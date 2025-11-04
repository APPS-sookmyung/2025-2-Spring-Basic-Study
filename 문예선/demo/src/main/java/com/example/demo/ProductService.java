package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    private ProductRepository pr;

    @Autowired
    ProductService(ProductRepository pr){
        this.pr = pr;
    }
    public String getProduct(){
        return pr.getProduct();

    }
}
