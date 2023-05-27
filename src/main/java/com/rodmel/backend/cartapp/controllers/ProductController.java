package com.rodmel.backend.cartapp.controllers;


import com.rodmel.backend.cartapp.Services.ProductService;
import com.rodmel.backend.cartapp.models.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public List<Product> list(){
        return productService.findAll();
    }
}
