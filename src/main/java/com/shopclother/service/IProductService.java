package com.shopclother.service;

import com.shopclother.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProduct();
    List<Product> getProductHaveCategoryIsTShirt();
    List<Product> getProductHaveCategoryIsShort();
    Product getProductHaveProductById (int masanpham );
}
