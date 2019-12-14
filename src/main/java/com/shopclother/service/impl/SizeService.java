package com.shopclother.service.impl;

import com.shopclother.dao.ISizeDAO;
import com.shopclother.entity.SizeSanPham;
import com.shopclother.service.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SizeService implements ISizeService {
    @Autowired
    ISizeDAO sizeDAO;
    @Override
    public List<SizeSanPham> getAllSize() {
        return sizeDAO.getAllSize ();
    }
}
