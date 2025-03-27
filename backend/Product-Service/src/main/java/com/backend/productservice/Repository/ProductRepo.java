package com.backend.productservice.Repository;

import com.backend.productservice.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends MongoRepository<Product, String>
{

    Optional<Product> findById(int id);

    Product findByName(String productName);

    List<Product> findBySkuCode(String skuCode);
}
