package com.shopclother.controller.cart;

import com.shopclother.entity.GioHang.GioHang;
import com.shopclother.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller(value = "homeControllerOfCart")
@RequestMapping(value = "/cart")
public class CartController {
    @Autowired
    ICartService cartService;
    @GetMapping
    public ModelAndView homePage(HttpSession session) {
        int totalMoney=0;
        ModelAndView mav = new ModelAndView ();
        if (session.getAttribute ( "giohangs" )!=null){
            List<GioHang> gioHangs = (List<GioHang>) session.getAttribute ( "giohangs" );
            totalMoney=cartService.moneyTotal ( gioHangs );
            mav.addObject ( "sizeGioHang",gioHangs.size () );
            mav.addObject ( "gioHangs",gioHangs );
        }
        mav.addObject ( "totalMoney",totalMoney );
        mav.setViewName ( "GioHang/GioHang" );
        return mav;
    }
}
