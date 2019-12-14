package com.shopclother.dao;

import com.shopclother.entity.Product;

import java.util.List;

public interface IProductDAO{
    List<Product> getListProduct();
    Product getProductHaveProductId(int masanpham);
}
