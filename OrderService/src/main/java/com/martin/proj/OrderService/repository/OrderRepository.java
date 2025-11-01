package com.martin.proj.OrderService.repository;

import com.martin.proj.OrderService.enity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
