package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Order", schema = "commerce", catalog = "")
public class OrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private long orderId;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "order_date")
    private Date orderDate;
    @Basic
    @Column(name = "oder_status")
    private String oderStatus;
    @Basic
    @Column(name = "total_amount")
    private Double totalAmount;

    @OneToMany(mappedBy = "orderEntity")
    private Set<OderItemsEntity> oderItemsEntity;
    @ManyToOne
    @JoinColumn(name = "payment_id",nullable = false)
    private PaymentsEntity paymentsEntity;

}
