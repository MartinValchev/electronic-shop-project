package com.martin.proj.OrderService;

import com.martin.proj.OrderService.config.OrderProperties;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderServiceController {

    private final OrderProperties orderProperties;

    @GetMapping("values/min")
    public int getMinValue() {
        return orderProperties.getMin();
    }

    @GetMapping("values/max")
    public int getMaxValue() {
        return orderProperties.getMax();
    }
}
