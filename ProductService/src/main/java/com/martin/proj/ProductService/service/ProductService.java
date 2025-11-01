package com.martin.proj.ProductService.service;

import com.martin.proj.ProductService.entity.Product;
import com.martin.proj.ProductService.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public Product getProductById(Long productId) {
        if (Objects.isNull(productId)) {
            return null;
        }
        return repository.findById(productId).orElse(null);
    }

    public List<Product> getAllProducts() {
        Iterable<Product> allProducts = repository.findAll();
        if (allProducts == null) {
            return null;
        }
        List<Product> productList = new ArrayList<>();
        allProducts.forEach(productList::add);
        return productList;
    }
}
