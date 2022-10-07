package com.demo.productmicroservice.services;

import com.demo.productmicroservice.documents.ProductDocument;
import com.demo.productmicroservice.dto.ProductDto;
import com.demo.productmicroservice.mappers.ProductMapper;
import com.demo.productmicroservice.repositories.ProductRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDto> getAll() {
        List<ProductDocument> products = productRepository.findAll();
        return productMapper.toDtos(products);
    }

    public void create(@NonNull ProductDto dto) {
        productRepository.save(productMapper.toModel(dto));
    }
}
