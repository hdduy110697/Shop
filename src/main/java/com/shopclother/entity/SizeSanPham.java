package com.shopclother.entity;

import javax.persistence.*;

@Entity
@Table(name = "sizesanpham")
public class SizeSanPham {
    @Id
    @Column(name = "masize")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int masize;

    @Column(name = "size")
    private String size;

    public int getMasize() {
        return masize;
    }

    public void setMasize(int masize) {
        this.masize = masize;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
