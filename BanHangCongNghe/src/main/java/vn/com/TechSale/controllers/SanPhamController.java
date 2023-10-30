package vn.com.TechSale.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.com.TechSale.services.SanPhamService;
import vn.com.TechSale.entities.SanPham;
import vn.com.TechSale.entities.SanPhamViewModel;

import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    @RequestMapping("admin/sanPham")
    public String hienThiDanhSachSanPham(Model model){
        List<SanPham> lstSanPham = sanPhamService.layDanhSach();

        model.addAttribute("lstSP", "lstSanPham");

        model.addAttribute("sanPham", new SanPhamViewModel());

        return "QuanLySanPham";
        //return trangChuSanPham;
    }

}
