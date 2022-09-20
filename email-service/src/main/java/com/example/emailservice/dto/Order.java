package com.example.emailservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private String orderId;
    private String orderName;
    private Integer quantity;
    private BigDecimal price;
}
