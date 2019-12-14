package com.shopclother.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "hoadon")
public class HoaDon {
    @Id
    @Column(name = "mahoadon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mahoadon;
    @Column(name = "tenkhachhang")
    private String tenkhachhang;
    @Column(name = "sodt")
    private String sodt;
    @Column(name = "diachigiaohang")
    private String diachigiaohang;
    @Column(name = "tinhtrang")
    private boolean tinhtrang;
    @Column(name = "ngaylap")
    private String ngaylap;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "mahoadon")
    private Set<ChiTietHoaDon> danhsachchitiethoadon;

    public Set<ChiTietHoaDon> getDanhsachchitiethoadon() {
        return danhsachchitiethoadon;
    }

    public void setDanhsachchitiethoadon(Set<ChiTietHoaDon> danhsachchitiethoadon) {
        this.danhsachchitiethoadon = danhsachchitiethoadon;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachigiaohang() {
        return diachigiaohang;
    }

    public void setDiachigiaohang(String diachigiaohang) {
        this.diachigiaohang = diachigiaohang;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }
}
