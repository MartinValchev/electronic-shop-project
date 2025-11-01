package com.martin.proj.OrderService.service;

import com.martin.proj.OrderService.enity.Order;
import com.martin.proj.OrderService.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public Order getOrderById(Long id) {
        if (Objects.isNull(id)) {
            return null;
        }
        //TODO:  Add feign client for Product service
        return repository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders() {
        //TODO:  Add feign client for Product
        return repository.findAll()
    }

    public Order addOrder(Order order) {
        if (Objects.isNull(order)) {
            return null;
        }
        //TODO:  feign client to check if product with id exists
        return repository.save(order);
    }
}
