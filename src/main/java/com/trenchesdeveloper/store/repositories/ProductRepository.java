package com.trenchesdeveloper.store.repositories;

import com.trenchesdeveloper.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}