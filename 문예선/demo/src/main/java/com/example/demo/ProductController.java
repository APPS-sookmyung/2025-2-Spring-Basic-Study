package com.example.demo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class ProductController {
    // 상품  조회 및 상품 등록
    ProductController() {
        System.out.println("진짜 될까?");
    }
    @RequestMapping(value="", method = RequestMethod.GET)
    public String getProduct(){
        return "문예선의 자바 교재";
    }
}