package com.shopclother.entity;

import javax.persistence.*;
@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "manhanvien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manhanvien;
    @Column(name = "hoten")
    private String hoten;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "gioitinh")
    private boolean gioitinh;
    @Column(name ="cmnd" )
    private String cmnd;
    @OneToOne
    @JoinColumn(name = "machucvu")
    private ChucVu chucVu; /*machucvu*/
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "tendangnhap",unique = true)
    private String tendangnhap;
    @Column(name = "matkhau")
    private String matkhau;

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
}
