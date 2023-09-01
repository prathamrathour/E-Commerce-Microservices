package com.microservices.notificationservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

    public class OrderPlaceEvent {
        private String orderNumber;
    }


