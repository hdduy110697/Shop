package com.shopclother.dao.impl;

import com.shopclother.dao.IProductDAO;
import com.shopclother.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public class ProductDAO extends AbtrackDAO<Product> implements IProductDAO  {
    @Override
    public List<Product> getListProduct() {
        return query ( "select s from Product s" );
    }
    public Product getProductHaveProductId(int masanpham){
        Product product = query1 ( "select s from Product s where s.id_product=?1",masanpham );
        // fix lazy ex
//        Hibernate.initialize(product.getChitietsanpham ());
        return product;
    }
}
