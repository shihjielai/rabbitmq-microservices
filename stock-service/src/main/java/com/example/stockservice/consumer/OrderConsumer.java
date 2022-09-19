package com.example.stockservice.consumer;

import com.example.stockservice.dto.OrderEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class OrderConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.order.name}")
    public void consume(OrderEvent orderEvent) {
        log.info("Order event received -> {}", orderEvent);
    }
}
