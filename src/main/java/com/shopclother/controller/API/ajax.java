package com.shopclother.controller.API;

import com.shopclother.entity.ChiTietSanPham;
import com.shopclother.entity.GioHang.GioHang;
import com.shopclother.entity.NhanVien;
import com.shopclother.entity.Product;
import com.shopclother.service.ICartService;
import com.shopclother.service.INhanVienService;
import com.shopclother.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/api/")
@SessionAttributes({"user","giohangs"})
public class ajax {
    @Autowired
    INhanVienService nhanVienService;
    @Autowired
    IProductService productService;
    @Autowired
    ICartService cartService;
    @ModelAttribute("user")
    public NhanVien getNhanVien() {
        return new NhanVien ();
    }
    @ModelAttribute("giohangs")
    public List<GioHang> getGioHang() {
        List<GioHang> gioHangs = new ArrayList<> ();
        return gioHangs;
    };
    @GetMapping
    public ModelAndView index() {
        return new ModelAndView ( "login" );
    }

    @GetMapping("KiemTraDangNhap")
    @ResponseBody
    public String KiemTraDangNhap(@RequestParam String tendangnhap, @RequestParam String password, ModelMap modelMap) {
        String mess = nhanVienService.doLogin ( tendangnhap, password );
        NhanVien nhanVien = nhanVienService.findNhanVien ( tendangnhap, password );
        if (nhanVien == null) {
            return mess;
        } else {
            modelMap.addAttribute ( "user", nhanVien );
        }
        return mess;
    }
    @GetMapping("GetSizeProduct")
    public @ResponseBody String GetSizeProduct(@RequestParam Integer masanpham,@RequestParam String color, ModelMap modelMap) {
        Product product = productService.getProductHaveProductById ( masanpham );
        StringBuffer result=new StringBuffer ();
        for (ChiTietSanPham c : product.getChitietsanpham ()) {
            if (c.getMausanpham ().getTenmau ().equals ( color ))
//                same color but can't same size
                result.append ( (c.getSizesanpham ().getSize ())+" " );
        }
        return result.toString ();
    }

    @GetMapping("ThemGioHang")
    @ResponseBody
    public String ThemGioHang(@RequestParam String color, @RequestParam String size,@RequestParam int masanpham, @ModelAttribute("giohangs") List<GioHang> gioHangs,ModelMap modelMap){
        // get product have id
        Product product = productService.getProductHaveProductById ( masanpham );
        //and then get detail product by color and size
        ChiTietSanPham chiTietSanPhamHaveColorAndSize=null;
        for (ChiTietSanPham detail :
                product.getChitietsanpham ()) {
            if (detail.getMausanpham ().getTenmau ().equals ( color )
                    && detail.getSizesanpham ().getSize ().equals ( size )){
                chiTietSanPhamHaveColorAndSize=detail;
            }
        }
        GioHang gioHang =new GioHang ();
        if (cartService.findIndexCartHaveSameIDProductDetail ( gioHangs,chiTietSanPhamHaveColorAndSize )==-1){
            gioHang.setChiTietSanPham ( chiTietSanPhamHaveColorAndSize );
            gioHangs.add ( gioHang );
        }else {
            int index=cartService.findIndexCartHaveSameIDProductDetail ( gioHangs,chiTietSanPhamHaveColorAndSize );
            // tang so luong len 1
            gioHang=gioHangs.get ( index );
            gioHang.setNumberInCart ( (gioHang.getNumberInCart ()+1) );
            gioHangs.set ( index,gioHang );
        }
        // lam nhiem vu check
        modelMap.addAttribute ( "giohangs", gioHangs );
        return String.valueOf ( gioHangs.size () );
    }
    @GetMapping("RemoveCart")

    public @ResponseBody String RemoveCart(ModelMap modelMap, HttpSession session,@RequestParam int idDetailProduct) {
        List<GioHang> gioHangResult = null;
        // kiem tra session
        if (session.getAttribute ( "giohangs" )!=null){
            List<GioHang> gioHangs = (List<GioHang>) session.getAttribute ( "giohangs" );
            for (int i=0;i<gioHangs.size ();i++){
                if (gioHangs.get ( i ).getChiTietSanPham ().getMachitietsanpham ()==idDetailProduct){
                    gioHangs.remove ( i );
                }
            }
            gioHangResult =gioHangs;
            modelMap.addAttribute ( "giohangs", gioHangs );
        }
//        trả về số lượng trong giỏ hàng
        return String.valueOf ( gioHangResult.size () );
    }
}

