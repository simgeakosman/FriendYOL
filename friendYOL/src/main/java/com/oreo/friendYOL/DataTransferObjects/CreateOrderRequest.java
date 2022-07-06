package com.oreo.friendYOL.DataTransferObjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderRequest {
    private Integer productId;
    private Integer customerId;
}
