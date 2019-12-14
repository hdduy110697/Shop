-- them chuc vu
INSERT INTO `dbminishopp`.`chucvu` (`tenchucvu`) VALUES ('admin');
INSERT INTO `dbminishopp`.`chucvu` (`tenchucvu`) VALUES ('user');

INSERT INTO `dbminishopp`.`danhmucsanpham` (`tendanhmuc`) VALUES ('Áo Thun');
INSERT INTO `dbminishopp`.`danhmucsanpham` (`tendanhmuc`) VALUES ('Quần Short');

--
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('215,000', 'xuất xứ châu âu', 'áo thun u234', '1');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('300,000', 'xuất xứ việt nam vãi len', 'áo thun l345', '1');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('152,000', 'aothun3.jpg', 'đẹp,vải tốt', 'áo thun h4534', '1');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('302,700', 'aothun4.jpg', 'tốt', 'áo thun 545', '1');

INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('235,000', 'xuất xứ xưởng', 'quần short h34', '2');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('400,000', 'quần short xưởng Anc', 'quần short k45', '2');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('345,000', 'quần xuất xứ từ Trung Quốc', 'quần short h345', '2');

INSERT INTO `dbminishopp`.`sizesanpham` (`size`) VALUES ('M');
INSERT INTO `dbminishopp`.`sizesanpham` (`size`) VALUES ('L');
INSERT INTO `dbminishopp`.`sizesanpham` (`size`) VALUES ('XL');

INSERT INTO `dbminishopp`.`mausanpham` (`tenmau`) VALUES ('Trắng');
INSERT INTO `dbminishopp`.`mausanpham` (`tenmau`) VALUES ('Đen');
INSERT INTO `dbminishopp`.`mausanpham` (`tenmau`) VALUES ('Xanh');

INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('215,000', 'xuất xứ châu âu', 'áo thun u234', '1');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('300,000', 'xuất xứ việt nam vãi len', 'áo thun l345', '1');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('152,000', 'aothun3.jpg', 'đẹp,vải tốt', 'áo thun h4534', '1');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('302,700', 'aothun4.jpg', 'tốt', 'áo thun 545', '1');

INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('235,000', 'xuất xứ xưởng', 'quần short h34', '2');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('400,000', 'quần short xưởng Anc', 'quần short k45', '2');
INSERT INTO `dbminishopp`.`sanpham` (`giatien`, `mota`, `tensanpham`, `madanhmuc`) VALUES ('345,000', 'quần xuất xứ từ Trung Quốc', 'quần short h345', '2');

-- chi tiet san pham
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun1trang.jpg', '13/05/2019', '20', '1', '4', '1');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun1den.jpg', '13/05/2019', '35', '2', '4', '2');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('quanshort1.jpg', '14/05/2018', '25', '1', '6', '3');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('quanshort1den.jpg', '14/8/2019', '33', '2', '6', '2');

INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun2trang.jpg', '12/05/2019', '20', '1', '3', '1');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun2den.jpg', '11/05/2019', '33', '2', '3', '3');

INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('quanshort2den.jpg', '13/05/2018', '25', '1', '5', '1');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('quanshort2trang.jpg', '12/8/2019', '13', '2', '5', '2');

INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('quanshort3den.jpg', '11/05/2018', '44', '2', '7', '1');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('quanshort3trang.jpg', '12/3/2019', '21', '1', '7', '2');

INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun3trang.jpg', '30/05/2019', '22', '1', '9', '1');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun3den.jpg', '12/05/2019', '33', '2', '9', '2');

INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun4trang.jpg', '22/06/2019', '22', '1', '10', '1');
INSERT INTO `dbminishopp`.`chitietsanpham` (`hinhsanpham`, `ngaynhap`, `soluong`, `mamau`, `masanpham`, `masize`) VALUES ('aothun4den.jpg', '12/05/2019', '55', '2', '10', '2');

