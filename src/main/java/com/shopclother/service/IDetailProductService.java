package com.shopclother.service;

import com.shopclother.entity.ChiTietSanPham;

import java.util.List;

public interface IDetailProductService {
    // vi cung mau se cung img
    List<ChiTietSanPham> getProductDetailByIDButDontHaveSameColor(Integer masanpham);
}
