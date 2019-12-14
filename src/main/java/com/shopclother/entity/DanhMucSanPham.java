package com.shopclother.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "danhmucsanpham")
public class DanhMucSanPham {
    @Id
    @Column(name = "madanhmuc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int madanhmuc;
    @Column(name = "tendanhmuc")
    private String tendanhmuc;
    @Column(name = "hinhdanhmuc")
    private String hinhdanhmuc;
//    1 danh muc co nhieu san pham
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "madanhmuc")
    private Set<Product> danhSachProduct;

    public Set<Product> getDanhSachProduct() {
        return danhSachProduct;
    }

    public void setDanhSachProduct(Set<Product> danhSachProduct) {
        this.danhSachProduct = danhSachProduct;
    }

    public int getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(int madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }

    public String getHinhdanhmuc() {
        return hinhdanhmuc;
    }

    public void setHinhdanhmuc(String hinhdanhmuc) {
        this.hinhdanhmuc = hinhdanhmuc;
    }
}
