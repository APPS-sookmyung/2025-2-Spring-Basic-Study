package com.example.demo.product;

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

    void saveProduct(){
        pr.saveProduct();
    }
}
