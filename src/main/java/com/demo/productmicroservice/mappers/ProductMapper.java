package com.demo.productmicroservice.mappers;

import com.demo.productmicroservice.documents.ProductDocument;
import com.demo.productmicroservice.dto.ProductDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductDto toDto (ProductDocument product);

    List<ProductDto> toDtos (List<ProductDocument> products);

    ProductDocument toModel(ProductDto dto);
}
