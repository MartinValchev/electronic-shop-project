package com.martin.proj.ProductService.repository;

import com.martin.proj.ProductService.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
