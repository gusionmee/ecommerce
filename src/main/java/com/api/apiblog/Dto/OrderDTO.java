package com.api.apiblog.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class OrderDTO {
    private Long orderId;
    private String email;
    private LocalDate orderDate;
    private String oderStatus;
    private Double totalAmount;
    private Long paymentId;


}
