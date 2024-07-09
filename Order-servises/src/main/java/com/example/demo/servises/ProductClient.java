package com.example.demo.servises;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.Product;

@FeignClient(name = "product-servises")
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable String id);
}