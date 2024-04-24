package com.api.apiblog.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OderItemsDTO {
    private Long orderItemId;
    private Integer quantity;
    private Long orderId;
    private Long productId;
    private Double orderProductPrice;


}
