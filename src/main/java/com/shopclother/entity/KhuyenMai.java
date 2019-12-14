package com.shopclother.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "khuyenmai")
public class KhuyenMai {
    @Id
    @Column(name = "makhuyenmai")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int makhuyenmai;
    @Column(name = "giagiam")
    private int giagiam;
    @Column(name = "tenkhuyenmai")
    private String tenkhuyenmai;
    @Column(name = "thoigianbatdau")
    private String thoigianbatdau;
    @Column(name = "thoigianketthuc")
    private String thoigianketthuc;
    @Column(name = "mota")
    private String mota;
    @Column(name = "hinhkhuyenmai")
    private String hinhkhuyenmai;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "chitietkhuyenmai",joinColumns = {@JoinColumn(name = "makhuyenmai",referencedColumnName = "makhuyenmai")},
            inverseJoinColumns = {@JoinColumn(name = "id_product",referencedColumnName = "id_product")})
    private Set<Product> danhsachsanpham;

    public Set<Product> getDanhsachsanpham() {
        return danhsachsanpham;
    }

    public void setDanhsachsanpham(Set<Product> danhsachsanpham) {
        this.danhsachsanpham = danhsachsanpham;
    }

    public int getGiagiam() {
        return giagiam;
    }

    public void setGiagiam(int giagiam) {
        this.giagiam = giagiam;
    }

    public int getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(int makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    public String getTenkhuyenmai() {
        return tenkhuyenmai;
    }

    public void setTenkhuyenmai(String tenkhuyenmai) {
        this.tenkhuyenmai = tenkhuyenmai;
    }

    public String getThoigianbatdau() {
        return thoigianbatdau;
    }

    public void setThoigianbatdau(String thoigianbatdau) {
        this.thoigianbatdau = thoigianbatdau;
    }

    public String getThoigianketthuc() {
        return thoigianketthuc;
    }

    public void setThoigianketthuc(String thoigianketthuc) {
        this.thoigianketthuc = thoigianketthuc;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhkhuyenmai() {
        return hinhkhuyenmai;
    }

    public void setHinhkhuyenmai(String hinhkhuyenmai) {
        this.hinhkhuyenmai = hinhkhuyenmai;
    }
}
