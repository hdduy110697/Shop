package com.shopclother.service.impl;
import com.shopclother.entity.ChiTietSanPham;
import com.shopclother.entity.GioHang.GioHang;
import com.shopclother.service.ICartService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartService implements ICartService {
    @Override
    public int findIndexCartHaveSameIDProductDetail(List<GioHang> gioHangs, ChiTietSanPham detailNeedToFind) {
        int result=-1;
        int i=0;
        for (GioHang g : gioHangs) {
            if (g.getChiTietSanPham ().getMachitietsanpham ()==detailNeedToFind.getMachitietsanpham ()){
                result=i;
            }
            i++;
        }
        return result;
    }

    @Override
    public int moneyTotal(List<GioHang> gioHangs) {
        int totalMoney=0;
        for (GioHang gioHang:gioHangs) {
            totalMoney+=(gioHang.getChiTietSanPham ().getSanpham ().getPriceProduct ())*gioHang.getNumberInCart ();
        }
        return totalMoney;
    }
}
