package com.shopclother.controller.detailProduct;
import com.shopclother.entity.*;
import com.shopclother.entity.GioHang.GioHang;
import com.shopclother.service.IDetailProductService;
import com.shopclother.service.IProductService;
import com.shopclother.service.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller(value = "homeControllerOfWebDetail")
@RequestMapping(value = "/detail")
@SessionAttributes("user")
public class detailProductController {

    @Autowired
    IProductService productService;
    @Autowired
    ISizeService sizeService;
    @Autowired
    IDetailProductService detailProductService;
    @GetMapping("/{masanpham}")
    public ModelAndView homePage(@PathVariable int masanpham ,HttpSession session) {
        ModelAndView mav = new ModelAndView ();
//        get product by ID
        Product product = productService.getProductHaveProductById ( masanpham);
        mav.addObject ( "product", product );
//        get all size
        List<ChiTietSanPham> chiTietSanPhamListDontHaveSameColor=detailProductService.getProductDetailByIDButDontHaveSameColor ( masanpham );
        mav.addObject ( "DetailProductDontHaveSameColor",chiTietSanPhamListDontHaveSameColor );
        List<SizeSanPham> sizeSanPhams=sizeService.getAllSize ();
        mav.addObject ( "sizes",sizeSanPhams );
        // lay session gio hang de hien thi
        if (session.getAttribute ( "giohangs" )!=null){
            List<GioHang> gioHangs = (List<GioHang>) session.getAttribute ( "giohangs" );
            mav.addObject ( "sizeGioHang",gioHangs.size () );
        }
        if (session.getAttribute ( "user" )!=null){
            NhanVien nhanVien= (NhanVien) session.getAttribute ( "user" );
            mav.setViewName ( "web/homeDetail" );
            // get user from @Session
            mav.addObject ( "userNhanVien",nhanVien );
        }else {
            mav.setViewName ( "web/homeDetail" );
        }
        return mav;
    }
}
