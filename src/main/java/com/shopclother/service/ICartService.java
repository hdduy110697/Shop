package com.shopclother.service;

import com.shopclother.entity.ChiTietSanPham;
import com.shopclother.entity.GioHang.GioHang;

import java.util.List;

public interface ICartService {
    // used to set NumberInCart
    int findIndexCartHaveSameIDProductDetail(List<GioHang> gioHangs, ChiTietSanPham detailNeedToFind);
    int moneyTotal(List<GioHang> gioHangs);
}
