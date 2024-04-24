package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments", schema = "commerce", catalog = "")
public class PaymentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_id")
    private long paymentId;
    @Basic
    @Column(name = "payment_method")
    private String paymentMethod;
    @OneToMany(mappedBy = "paymentsEntity")
    private Set<OrderEntity> orderEntity;

}
