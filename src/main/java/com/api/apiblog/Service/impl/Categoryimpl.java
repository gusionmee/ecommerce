package com.api.apiblog.Service.impl;


import com.api.apiblog.Dto.CategoryDTO;
import com.api.apiblog.Entity.CategoryEntity;
import com.api.apiblog.Service.CategoryService;
import com.api.apiblog.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categoryimpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;


    @Autowired
    ModelMapper modelMapper;


    @Override
    public List<CategoryDTO> getall() {
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();


        return categoryEntities.stream().map(categoryEntity -> modelMapper.map(categoryEntity,CategoryDTO.class)).toList();



    }

    @Override

    public CategoryDTO createPost(CategoryDTO categoryDTO) {
        if (categoryDTO == null){
            throw new RuntimeException("Category cannot be null");
        }
        CategoryEntity categoryEntity = modelMapper.map(categoryDTO,CategoryEntity.class);
        categoryRepository.save(categoryEntity);
        return categoryDTO;
    }

    @Override
    public CategoryDTO updatePost(long id, CategoryDTO categoryDTO) {
        if(categoryRepository.existsById(id)){
            CategoryEntity categoryEntity = categoryRepository.findById(id).orElse(null);
             if(categoryEntity != null){
                categoryEntity= modelMapper.map(categoryDTO,CategoryEntity.class);
                categoryEntity.setCategoryId(id);
                categoryEntity=categoryRepository.save(categoryEntity);
             }

            return modelMapper.map(categoryEntity,CategoryDTO.class);
        }
        return null;
    }


    @Override
    public CategoryDTO deletePost(long id) {

        if(categoryRepository.existsById(id)){
            CategoryEntity categoryEntity = categoryRepository.getById(id);
            categoryRepository.delete(categoryEntity);
            return modelMapper.map(categoryEntity,CategoryDTO.class);
        }
        return  null;

    }

    @Override
    public CategoryDTO getPostById(long id) {
        if(categoryRepository.existsById(id)){
            CategoryEntity categoryEntity = categoryRepository.getById(id);
            return modelMapper.map(categoryEntity,CategoryDTO.class);
        }
        return null;
    }
}
