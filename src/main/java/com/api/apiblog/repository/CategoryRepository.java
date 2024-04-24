package com.api.apiblog.repository;

import com.api.apiblog.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
}
