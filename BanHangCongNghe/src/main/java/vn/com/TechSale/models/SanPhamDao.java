package vn.com.TechSale.models;

import vn.com.TechSale.entities.SanPham;

import java.util.List;

public interface SanPhamDao extends IHanhDong<SanPham, String>{

    List<SanPham> timKiemThongTin(String maSanPham, String tuKhoa);
}
