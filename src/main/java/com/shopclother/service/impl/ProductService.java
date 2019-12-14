package com.shopclother.service.impl;

import com.shopclother.dao.IProductDAO;
import com.shopclother.entity.Product;
import com.shopclother.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    IProductDAO productDAO;
    @Override
    public List<Product> getProduct() {
        return productDAO.getListProduct ();
    }
    public List<Product> getProductHaveCategoryIsTShirt() {
        List<Product> listAll =productDAO.getListProduct ();
        List<Product> listHaveCategoryIsTShirt=new ArrayList<> ();
        for (Product s : listAll) {
            if(s.getDanhmucsanpham ().getTendanhmuc ().equals ( "Áo Thun" ))
                listHaveCategoryIsTShirt.add ( s );
        }
        return listHaveCategoryIsTShirt;
    }

    public List<Product> getProductHaveCategoryIsShort() {
        List<Product> listAll =productDAO.getListProduct ();
        List<Product> listHaveCategoryIsShort=new ArrayList<> ();
        for (Product s : listAll) {
            if(s.getDanhmucsanpham ().getTendanhmuc ().equals ( "Quần Short" ))
                listHaveCategoryIsShort.add ( s );
        }
        return listHaveCategoryIsShort;
    }
    @Override
    public Product getProductHaveProductById (int masanpham ) {
        return productDAO.getProductHaveProductId ( masanpham );
    }
}
