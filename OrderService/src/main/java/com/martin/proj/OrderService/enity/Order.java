package com.martin.proj.OrderService.enity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime creationDate;
    private LocalDateTime modifiedDate;
    private BigDecimal amount;

    @Transient
    private List<ProductDto> products;
}
