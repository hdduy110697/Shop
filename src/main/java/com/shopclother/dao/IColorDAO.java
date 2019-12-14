package com.shopclother.dao;

import com.shopclother.entity.MauSanPham;

import java.util.List;

public interface IColorDAO {
    List<MauSanPham> getColorByIDProduct(Integer masanpham);
}
