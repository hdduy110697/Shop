package com.shopclother.service.impl;

import com.shopclother.dao.IChucVuDAO;
import com.shopclother.dao.INhanVienDAO;
import com.shopclother.entity.ChucVu;
import com.shopclother.entity.NhanVien;
import com.shopclother.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class NhanVienService implements INhanVienService {

    @Autowired
    INhanVienDAO nhanVienDAO;

    @Autowired
    IChucVuDAO chucVuDAO;

    public List<NhanVien> LayDanhSachNhanVien(){
        return nhanVienDAO.findAll ();
    }
    public void outputAllNhanVien(){
        List<NhanVien> list= LayDanhSachNhanVien ();
        for (NhanVien n :
                list) {
            System.out.println (n.getHoten ());
        }
    }
    public NhanVien findNhanVien(String username, String password){
        return nhanVienDAO.findByUserNameAndPassword ( username,password );
    }
    public String doLogin(String username, String password){
        NhanVien nhanVien= nhanVienDAO.findByUserNameAndPassword ( username,password );
        String message;
        if (nhanVien==null)
            message="FAILURE";
        else
            message="SUCCESS";
        return message;
    }


    public NhanVien findById(int id){
        return nhanVienDAO.findById ( id );
    }
    public void saveNhanVien(String hoten,String diachi, boolean gioitinh,
                                 String cmnd,String email,String tendangnhap,String matkhau){
        NhanVien nhanVien=new NhanVien ();
        nhanVien.setHoten ( hoten );
        nhanVien.setDiachi ( diachi );
        nhanVien.setGioitinh ( gioitinh );
        nhanVien.setCmnd ( cmnd );
        nhanVien.setEmail ( email );
        nhanVien.setTendangnhap ( tendangnhap );
        nhanVien.setMatkhau ( matkhau );
        // mac định chức vụ là user
        ChucVu chucVu= chucVuDAO.findById ( 2 );
        nhanVien.setChucVu ( chucVu );
//        System.out.println (nhanVien.getChucVu ().getTenchucvu ());
        nhanVienDAO.saveNhanVien ( nhanVien );

    }


    // test email regex
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }

    @Override
    public String checkSignUp(String userName, String email) {
        String result="";
        NhanVien nhanVienFindByUserName=nhanVienDAO.findByUserName ( userName );
        NhanVien nhanVienFindByEmail=nhanVienDAO.findByEmail ( email );
        if (nhanVienFindByUserName!=null&&nhanVienFindByUserName!=null){
            result="Email,username already have";
        } else if (nhanVienFindByUserName!=null&&nhanVienFindByEmail==null)
             result="UserName already have";
        else if (nhanVienFindByUserName==null&&nhanVienFindByEmail!=null)
            result="Email already have";
        else{
            if (validate ( email )==false){
                result="nhap dung kieu email";
            }else
                result="true";
        }
        // check kieu email
        return result;
    }
}
