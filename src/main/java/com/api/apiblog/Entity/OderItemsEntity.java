package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "oder_items", schema = "commerce", catalog = "")
public class OderItemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_item_id")
    private long orderItemId;
    @Basic
    @Column(name = "quantity")
    private Integer quantity;

    @Basic
    @Column(name = "order_product_price")
    private Double orderProductPrice;
    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private ProductsEntity productsEntity;
    @ManyToOne
    @JoinColumn(name = "order_id",nullable = false)
    private OrderEntity orderEntity;

}
