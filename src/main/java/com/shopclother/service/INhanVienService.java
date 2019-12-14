package com.shopclother.service;

import com.shopclother.entity.NhanVien;

import java.util.List;

public interface INhanVienService {
    List<NhanVien> LayDanhSachNhanVien();
    void outputAllNhanVien();
    NhanVien findNhanVien(String username, String password);
    String doLogin(String username, String password);
    boolean validate(String emailStr);
    NhanVien findById(int id);
//save
    void saveNhanVien(String hoten,String diachi, boolean gioitinh,
                      String cmnd,String email,String tendangnhap,String matkhau);
    // return string neu username or email dang ky bi trung
    String checkSignUp(String userName,String email);
}
