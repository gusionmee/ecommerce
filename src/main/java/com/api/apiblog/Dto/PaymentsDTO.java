package com.api.apiblog.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentsDTO {
    private Long paymentId;
    private String paymentMethod;


}
