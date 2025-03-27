package com.backend.productservice.Controller;

import com.backend.productservice.DTO.ProductDto;
import com.backend.productservice.Model.Product;
import com.backend.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
@CrossOrigin
public class ProductController
{
    @Autowired
    private ProductService ProductService;

    //CREATING PRODUCT API
    @PostMapping("/create")
    public Product createProduct(@RequestBody ProductDto product)
    {
        return ProductService.create(product);
    }

    //GET ALL PRODUCTS API
    @RequestMapping("/get")
    public List<Product> getProduct()
    {
       Product pro = (Product) ProductService.getAll();
       return List.of(pro);
    }

    //GET PRODUCT BY NAME.
    @GetMapping("/search/{id}")
    public ResponseEntity<List<ProductDto>> getBySearch(@PathVariable int id) {
        List<ProductDto> productDto = ProductService.getbyId(id);
        if (productDto == null) {
            return ResponseEntity.notFound().build(); // Return 404 if product not found
        }
        return ResponseEntity.ok(productDto); // Return 200 OK with the product
    }
    // Update Product
    @PutMapping("/update/{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable int id, @RequestBody ProductDto productDto) {
        ProductDto updatedProduct = ProductService.updateProduct(id, productDto);

        if (updatedProduct == null) {
            // Product not found, return 404
            return ResponseEntity.notFound().build();
        }

        // Return the updated product with status 200 OK
        return ResponseEntity.ok(updatedProduct);
    }

    //GET PRODUCT BY NAME.
    @GetMapping("/search/{product_name}")
    public ResponseEntity<List<ProductDto>> getByProductId(@PathVariable String product_name) {
        List<ProductDto> productDto = ProductService.getByName(product_name);
        return ResponseEntity.ok(productDto);
    }

    //GET PRODUCT BY SKU_CODE.
    @GetMapping("/search/{sku_code}")
    public ResponseEntity<List<ProductDto>> getBySkuCode(@PathVariable String sku_code) {
        List<ProductDto> productDto = ProductService.getBySku(sku_code);
        return ResponseEntity.ok(productDto);
    }

}
