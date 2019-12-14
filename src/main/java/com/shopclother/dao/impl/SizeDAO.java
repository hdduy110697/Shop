package com.shopclother.dao.impl;

import com.shopclother.dao.ISizeDAO;
import com.shopclother.entity.SizeSanPham;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SizeDAO extends AbtrackDAO<SizeSanPham> implements ISizeDAO {
    @Override
    public List<SizeSanPham> getAllSize() {
        return query ( "select s from SizeSanPham s" );
    }

}
