package com.shopclother.dao.impl;

import com.shopclother.dao.IColorDAO;
import com.shopclother.entity.MauSanPham;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public class ColorDAODAO extends AbtrackDAO<MauSanPham> implements IColorDAO {

    @Override
    @Transactional
    public List<MauSanPham> getColorByIDProduct(Integer masanpham) {
        List<MauSanPham> mauSanPhamList= query ( "select distinct m from ChiTietSanPham c join MauSanPham m where m.id_product=?1 and c.mamau=m.mamau",masanpham );
        return mauSanPhamList;
    }
}
