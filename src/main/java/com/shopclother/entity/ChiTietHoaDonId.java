package com.shopclother.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChiTietHoaDonId implements Serializable {
    @Column(name = "mahoadon")
    private int mahoadon;
    @Column(name = "machitietsanpham")
    private int machitietsanpham;

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public int getMachitietsanpham() {
        return machitietsanpham;
    }

    public void setMachitietsanpham(int machitietsanpham) {
        this.machitietsanpham = machitietsanpham;
    }
}
