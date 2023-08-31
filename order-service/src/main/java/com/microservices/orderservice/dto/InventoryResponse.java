package com.microservices.orderservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class InventoryResponse {
    private String skuCode;
    private boolean isInStock;

}
