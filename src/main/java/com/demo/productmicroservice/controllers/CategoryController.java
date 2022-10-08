package com.demo.productmicroservice.controllers;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@RefreshScope
@Data
public class CategoryController {

    @Value("${app.testProperty}")
    private String testProperty;

    @GetMapping("test-property")
    public String getTestProperty(){
        return this.testProperty;
    }
}
