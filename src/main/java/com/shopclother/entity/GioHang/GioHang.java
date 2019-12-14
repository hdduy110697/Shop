package com.shopclother.entity.GioHang;

import com.shopclother.entity.ChiTietSanPham;

public class GioHang {
    private ChiTietSanPham chiTietSanPham;
    private int numberInCart=1;

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public GioHang() {
    }

    public GioHang(ChiTietSanPham chiTietSanPham) {
        this.chiTietSanPham = chiTietSanPham;
    }

    public ChiTietSanPham getChiTietSanPham() {
        return chiTietSanPham;
    }

    public void setChiTietSanPham(ChiTietSanPham chiTietSanPham) {
        this.chiTietSanPham = chiTietSanPham;
    }
}
