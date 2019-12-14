package com.shopclother.service.impl;

import com.shopclother.dao.IColorDAO;
import com.shopclother.entity.MauSanPham;
import com.shopclother.service.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService implements IColorService {
    @Autowired
    IColorDAO colorDAO;
    @Override
    public List<MauSanPham> getColorByIDProduct(Integer masanpham) {
        return colorDAO.getColorByIDProduct ( masanpham );
    }
}
