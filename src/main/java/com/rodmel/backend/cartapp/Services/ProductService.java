package com.rodmel.backend.cartapp.Services;

import com.rodmel.backend.cartapp.models.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

}
