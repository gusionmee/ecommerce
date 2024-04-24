package com.api.apiblog.repository;

import com.api.apiblog.Entity.CategoryEntity;
import com.api.apiblog.Entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductsEntity,Long> {
}
