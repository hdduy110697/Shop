package com.shopclother.service.impl;

import com.shopclother.dao.IChucVuDAO;
import com.shopclother.entity.ChucVu;
import com.shopclother.service.IChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChucVuService implements IChucVuService {
    @Autowired
    IChucVuDAO chucVuDAO;
    @Override
    public ChucVu findById(Integer id) {
        return chucVuDAO.findById ( id );
    }
}
