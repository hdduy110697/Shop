package com.shopclother.service;

import com.shopclother.entity.MauSanPham;

import java.util.List;

public interface IColorService {
    List<MauSanPham> getColorByIDProduct(Integer masanpham);
}
