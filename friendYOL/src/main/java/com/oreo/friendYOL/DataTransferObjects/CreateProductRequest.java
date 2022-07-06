package com.oreo.friendYOL.DataTransferObjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequest {

    private String name;
    private String brand;
    private String description;
    private double price;
    private String pictureUrl;
    private Integer sellerId;

}
