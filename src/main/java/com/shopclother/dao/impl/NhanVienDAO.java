package com.shopclother.dao.impl;

import com.shopclother.dao.INhanVienDAO;
import com.shopclother.entity.NhanVien;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public class NhanVienDAO extends AbtrackDAO<NhanVien> implements INhanVienDAO {

    public NhanVien findById(Integer id) {
        NhanVien nhanVien =entityManager.find ( NhanVien.class,id );
//        close ();
        return nhanVien;
    }
    public List<NhanVien> findAll() {
        //        close ();
        return query ( "select n from NhanVien n" );
    }

    @Override
    public NhanVien findByUserNameAndPassword(String username, String password) {
        return query1 ( "select n from NhanVien n where n.tendangnhap=?1 and n.matkhau=?2",username,password );

    }
    public NhanVien findByUserName(String username){
        return query1 ( "select n from NhanVien n where n.tendangnhap=?1",username );
    }

    public NhanVien findByEmail(String email){
        List<NhanVien> nhanViens= query ( "select n from NhanVien n where n.email=?1" ,email);
        if (nhanViens.size ()==0){
            return null;
        }else
            return nhanViens.get ( 0 );
    }


    @Override
    public void saveNhanVien(@NotNull NhanVien nhanVien) {
//        save ( nhanVien );
        entityManager.persist ( nhanVien );
    }
}
