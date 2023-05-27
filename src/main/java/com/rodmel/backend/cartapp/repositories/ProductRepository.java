package com.rodmel.backend.cartapp.repositories;

import com.rodmel.backend.cartapp.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
