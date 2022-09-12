package com.example.stockservice.dto;

import lombok.Data;

@Data
public class OrderEvent {
    private String status;
    private String message;
    private Order order;
}
