package com.api.apiblog.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartsDTO {
    private Long cartId;
    private Double totalPrice;
    private Long userId;


}
