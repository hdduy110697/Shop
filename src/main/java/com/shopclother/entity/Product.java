package com.shopclother.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_product;
    @OneToOne
    @JoinColumn(name = "madanhmuc")
    private DanhMucSanPham danhmucsanpham;

    @Column(name = "name_product")
    private String nameProduct;
    @Column(name = "price")
    private Integer priceProduct;
    @Column(name = "description",columnDefinition = "TEXT")
    private String description;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product")
    private Set<ChiTietSanPham> chitietsanpham;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "CHITIETKHUYENMAI",joinColumns = {@JoinColumn(name = "id_product",referencedColumnName = "id_product")},
            inverseJoinColumns = {@JoinColumn(name = "makhuyenmai",referencedColumnName = "makhuyenmai")})
    private Set<KhuyenMai> danhsachkhuyenmai;

    public Set<ChiTietSanPham> getChitietsanpham() {
        return chitietsanpham;
    }

    public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
        this.chitietsanpham = chitietsanpham;
    }

    public Set<KhuyenMai> getDanhsachkhuyenmai() {
        return danhsachkhuyenmai;
    }

    public void setDanhsachkhuyenmai(Set<KhuyenMai> danhsachkhuyenmai) {
        this.danhsachkhuyenmai = danhsachkhuyenmai;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int masanpham) {
        this.id_product = masanpham;
    }

    public DanhMucSanPham getDanhmucsanpham() {
        return danhmucsanpham;
    }

    public void setDanhmucsanpham(DanhMucSanPham danhmucsanpham) {
        this.danhmucsanpham = danhmucsanpham;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String tensanpham) {
        this.nameProduct = tensanpham;
    }

    public Integer getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Integer giatien) {
        this.priceProduct = giatien;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String mota) {
        this.description = mota;
    }


    public String AvatarForHomePage(){
        // lay ra ten cua anh? co ten trung voi tên nhập váo
        String namePictureNeedGet="";
        Integer max=0;
        //lay san pham co so luong nhieu nhat lam avatar
        for (ChiTietSanPham detail :this.chitietsanpham) {
            if (detail.getSoluong ()>max){
                max = detail.getSoluong ();
            }
        }
        for (ChiTietSanPham detail :this.chitietsanpham) {
            if (detail.getSoluong ()==max){
                namePictureNeedGet=detail.getHinhsanpham ();
            }
        }
        return namePictureNeedGet;
    }
}
