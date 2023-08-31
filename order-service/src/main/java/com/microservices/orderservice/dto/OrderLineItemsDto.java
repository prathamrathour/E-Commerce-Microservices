package com.microservices.orderservice.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderLineItemsDto {
    private Long Id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
