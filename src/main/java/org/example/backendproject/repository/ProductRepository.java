package org.example.backendproject.repository;

import org.example.backendproject.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}