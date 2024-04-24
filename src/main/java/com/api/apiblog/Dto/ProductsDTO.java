package com.api.apiblog.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductsDTO {
    private Long productId;
    private String description;
    private String image;
    private Double price;
    private String productName;
    private String quantity;
    private Long category;


}
