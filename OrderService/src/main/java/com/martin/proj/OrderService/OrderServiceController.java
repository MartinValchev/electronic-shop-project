package com.martin.proj.OrderService;

import com.martin.proj.OrderService.config.OrderProperties;
import com.martin.proj.OrderService.enity.Order;
import com.martin.proj.OrderService.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RefreshScope
public class OrderServiceController {

    private final OrderProperties orderProperties;
    private final OrderService orderService;

    @GetMapping("values/min")
    public int getMinValue() {
        return orderProperties.getMin();
    }

    @GetMapping("values/max")
    public int getMaxValue() {
        return orderProperties.getMax();
    }

    @GetMapping("orders/{id}")
    public Order getOrderById(@PathVariable  Long id) {
        orderService
    }
}
