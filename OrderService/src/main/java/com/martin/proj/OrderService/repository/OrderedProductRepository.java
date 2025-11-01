package com.martin.proj.OrderService.repository;

import com.martin.proj.OrderService.enity.OrderedProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrderedProductRepository extends CrudRepository<OrderedProduct, Long> {
}
