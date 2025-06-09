package org.example.thigki.controller;

import org.example.thigki.dto.resp.ThongTinKhachHangFullResp;
import org.example.thigki.service.thongTinKhachHang.ThongTinKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/thongtin")
public class ThongTinKhachHangController {
    @Autowired
    private ThongTinKhachHangService service;

    @GetMapping("/list")
    public String showThongTinKhachHang(Model model) {
        List<ThongTinKhachHangFullResp> list = service.getAllThongTinKhachHang();
        model.addAttribute("listThongTin", list);
        return "thongtin/list";
    }
}