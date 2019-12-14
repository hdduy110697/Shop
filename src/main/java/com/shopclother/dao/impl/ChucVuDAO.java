package com.shopclother.dao.impl;

import com.shopclother.dao.IChucVuDAO;
import com.shopclother.entity.ChucVu;
import com.shopclother.entity.NhanVien;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ChucVuDAO extends AbtrackDAO<ChucVu> implements IChucVuDAO  {
    @Override
    public ChucVu findById(Integer id) {
        ChucVu chucVu =entityManager.find ( ChucVu.class,id );
//        close ();
        return chucVu;
    }
}
