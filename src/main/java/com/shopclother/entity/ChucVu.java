package com.shopclother.entity;

import javax.persistence.*;

@Entity
@Table(name = "chucvu")
public class ChucVu {
    @Id
    @Column(name = "machucvu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int machucvu;
    @Column(name = "tenchucvu")
    private String tenchucvu;
    public int getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }
}
