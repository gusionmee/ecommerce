package com.api.apiblog.Service.impl;

import com.api.apiblog.Dto.ProductsDTO;
import com.api.apiblog.Entity.ProductsEntity;
import com.api.apiblog.Service.ProductService;
import com.api.apiblog.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productsimpl  implements ProductService{
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ProductsDTO> getall() {
        List<ProductsEntity> productsEntity = productRepository.findAll();
        return productsEntity.stream().map(productsEntity1 -> modelMapper.map(productsEntity1,ProductsDTO.class)).toList();
    }

    @Override
    public ProductsDTO createPost(ProductsDTO productsDTO) {
        if (productsDTO == null){
            throw new RuntimeException("Products cannot be null");
        }
        ProductsEntity productsEntity = modelMapper.map(productsDTO,ProductsEntity.class);
        productRepository.save(productsEntity);


        return productsDTO;
    }

    @Override
    public ProductsDTO updatePost(long id, ProductsDTO productsDTO) {
        if (productRepository.existsById(id)){
            ProductsEntity productsEntity = productRepository.findById(id).orElse(null);
            if (productsEntity != null){
                productsEntity = modelMapper.map(productsDTO,ProductsEntity.class);
                productsEntity.setProductId(id);
                productsEntity = productRepository.save(productsEntity);
            }
            return modelMapper.map(productsEntity,ProductsDTO.class);
        }
        return null;
    }

    @Override
    public ProductsDTO deletePost(long id) {
        return null;
    }

    @Override
    public ProductsDTO getPostById(long id) {

        if (id==0){
            throw new RuntimeException("Id cannot be null");
        }
        if(productRepository.existsById(id)){
            ProductsEntity productsEntity = productRepository.findById(id).orElse(null);
            if (productsEntity != null){
                return modelMapper.map(productsEntity,ProductsDTO.class);
            }
        }

        return null;
    }
}
