package com.example.demo.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService ps;

    // 상품  조회 및 상품 등록
    ProductController() {
        System.out.println("진짜 될까?");
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public String getProduct(){
        return ps.getProduct();
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public void saveProduct() {
        ps.saveProduct();
    }
}