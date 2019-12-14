package com.shopclother.service.impl;

import com.shopclother.dao.IProductDAO;
import com.shopclother.entity.ChiTietSanPham;
import com.shopclother.entity.Product;
import com.shopclother.service.IDetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
@Service
public class DetailProductService implements IDetailProductService {
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<> ();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    @Autowired
    IProductDAO productDAO;
    @Override
    public List<ChiTietSanPham> getProductDetailByIDButDontHaveSameColor(Integer masanpham) {
        Product product =productDAO.getProductHaveProductId ( masanpham );
        // get ChiTietSanPham dua  vao mau
        // loai bo chi tiet co mau giống nhau

        List<ChiTietSanPham> chiTietSanPhamList=(product.getChitietsanpham ()).stream ().filter ( distinctByKey ( p -> p.getMausanpham () ) )
                .collect ( Collectors.toList () );
        return chiTietSanPhamList;
    }
}
