package com.example.bysell.repositories;

import com.example.bysell.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByTitle(String title);
}
