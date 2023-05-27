package com.rodmel.backend.cartapp.Services;

import com.rodmel.backend.cartapp.models.entities.Product;
import com.rodmel.backend.cartapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private  ProductRepository productRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
