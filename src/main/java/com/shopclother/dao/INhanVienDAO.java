package com.shopclother.dao;

import com.shopclother.entity.NhanVien;

import java.util.List;

public interface INhanVienDAO extends GenericDAO<NhanVien>{
    NhanVien findById(Integer id);
    List<NhanVien> findAll() ;
    NhanVien findByUserNameAndPassword(String username,String password);
    // save
    void saveNhanVien(NhanVien nhanVien);
    NhanVien findByEmail(String email);
    NhanVien findByUserName(String username);

}
