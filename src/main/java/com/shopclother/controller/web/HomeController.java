package com.shopclother.controller.web;

import com.shopclother.entity.GioHang.GioHang;
import com.shopclother.entity.NhanVien;
import com.shopclother.entity.Product;
import com.shopclother.service.INhanVienService;
import com.shopclother.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller(value = "homeControllerOfWeb")
@RequestMapping(value = "/trang-chu")
@SessionAttributes("user")
public class HomeController {
    @Autowired
    INhanVienService nhanVienService;
    @Autowired
    IProductService productService;

    @GetMapping
    public ModelAndView homePage( HttpSession session) {
        ModelAndView mav = new ModelAndView ();
        // get list have category is TShirt
        List<Product> listProductHaveCategoryIsTShirt= productService.getProductHaveCategoryIsTShirt ();
        // addObject
        mav.addObject ( "ProductsHaveCategoryIsTShirt",listProductHaveCategoryIsTShirt );
        // get list have category is short
        List<Product> listProductHaveCategoryIsShort= productService.getProductHaveCategoryIsShort ();
        // addObject
        mav.addObject ( "ProductsHaveCategoryIsShort",listProductHaveCategoryIsShort );
        //end
        if (session.getAttribute ( "giohangs" )!=null){
            List<GioHang> gioHangs = (List<GioHang>) session.getAttribute ( "giohangs" );
            mav.addObject ( "sizeGioHang",gioHangs.size () );
        }
        if (session.getAttribute ( "user" )!=null){
            NhanVien nhanVien= (NhanVien) session.getAttribute ( "user" );
            mav.setViewName ( "web/home" );
            // get user from @Session
            mav.addObject ( "userNhanVien",nhanVien );
        }else {
            mav.setViewName ( "web/home" );
        }
        return mav;
    }
}
