package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products", schema = "commerce", catalog = "")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id")
    private long productId;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "image")
    private String image;
    @Basic
    @Column(name = "price")
    private Double price;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "quantity")
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "Category_id", nullable = false)
    private CategoryEntity categoryEntity;
    @OneToMany(mappedBy = "productsEntity")
    private Set<CartItemsEntity> cartItemsEntity;

    @OneToMany(mappedBy = "productsEntity")
    private  Set<CartItemsEntity> cartItemsEntities;


}
