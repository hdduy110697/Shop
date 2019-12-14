package com.shopclother.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chitiethoadon")
public class ChiTietHoaDon {
    @EmbeddedId
    ChiTietHoaDonId chiTietHoaDonId;
    @Column(name = "soluong")
    private int soluong;
    @Column(name = "giatien")
    private int giatien;

    public ChiTietHoaDonId getChiTietHoaDonId() {
        return chiTietHoaDonId;
    }

    public void setChiTietHoaDonId(ChiTietHoaDonId chiTietHoaDonId) {
        this.chiTietHoaDonId = chiTietHoaDonId;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }
}
