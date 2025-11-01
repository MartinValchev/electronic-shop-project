package com.martin.proj.OrderService.enity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
class ProductDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
}
