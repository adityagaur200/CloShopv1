package com.backend.productservice.DTO;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private String product_name;
    private int product_price;
    private String product_description;
    private List<Byte> product_image;
    private int product_quantity;
    private String product_sku;


    public int getProduct_price() {
        return product_price;
    }
    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }
    public String getProduct_description() {
        return product_description;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public List<Byte> getProduct_image() {
        return product_image;
    }
    public void setProduct_image(List<Byte> product_image) {
        this.product_image = product_image;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public int getProduct_quantity() {
        return product_quantity;
    }
    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }
    public String getProduct_sku(String productSku) {
        return product_sku;
    }
    public void setProduct_sku(String product_sku) {
        this.product_sku = product_sku;
    }
}
