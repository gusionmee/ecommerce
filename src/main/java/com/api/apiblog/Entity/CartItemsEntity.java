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
@Table(name = "Cart_items", schema = "commerce", catalog = "")
public class CartItemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Cart_item-id")
    private long cartItemId;
    @Basic
    @Column(name = "produc_price")
    private Double producPrice;
    @Basic
    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "Card_id",nullable = false)
    private  CartsEntity cartsEntity;
    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private  ProductsEntity productsEntity;


}
