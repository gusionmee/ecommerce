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
@Table(name = "category", schema = "commerce", catalog = "")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Category_id")
    private long categoryId;
    @Basic
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(mappedBy = "categoryEntity")
    private Set<ProductsEntity> productsEntities;

}
