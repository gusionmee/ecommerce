package com.api.apiblog.Service;

import com.api.apiblog.Entity.CategoryEntity;

import java.util.List;

public interface BaseService<T> {
    List<T> getall();
    T createPost(T t);

    T updatePost(long id, T t);

    T deletePost(long id);

    T getPostById(long id);
}
