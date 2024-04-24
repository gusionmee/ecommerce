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
@Table(name = "Carts", schema = "commerce", catalog = "")
public class CartsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Cart_id")
    private long cartId;
    @Basic
    @Column(name = "TotalPrice")
    private Double totalPrice;

    @ManyToOne
    @JoinColumn(name = "User_id",nullable = false)
    private  UsersEntity usersEntity;
    @OneToMany(mappedBy = "cartsEntity")
    Set<CartItemsEntity> cartItemsEntity;



}
