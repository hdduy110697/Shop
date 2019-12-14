package com.shopclother.entity;

import javax.persistence.*;

@Entity
@Table(name = "mausanpham")
public class MauSanPham {
    @Id
    @Column(name = "mamau")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mamau;
    @Column(name = "tenmau")
    private String tenmau;
    public int getMamau() {
        return mamau;
    }

    public void setMamau(int mamau) {
        this.mamau = mamau;
    }

    public String getTenmau() {
        return tenmau;
    }

    public void setTenmau(String tenmau) {
        this.tenmau = tenmau;
    }


}
