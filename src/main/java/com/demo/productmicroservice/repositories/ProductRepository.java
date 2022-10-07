package com.demo.productmicroservice.repositories;

import com.demo.productmicroservice.documents.ProductDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductDocument, Long> {

}
