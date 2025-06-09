package org.example.thigki.controller;

import org.example.thigki.dto.req.SuDungDichVuReq;
import org.example.thigki.dto.req.SuDungMayReq;
import org.example.thigki.service.dichVu.DichVuService;
import org.example.thigki.service.khachHang.KhachHangService;
import org.example.thigki.service.suDungDichVu.SuDungDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sudungdichvu")
public class SuDungDichVuController {
    @Autowired
    private SuDungDichVuService suDungDichVuService;

    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private DichVuService dichVuService;

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("khachHangList" , khachHangService.findAll());
        model.addAttribute("dichVuList" , dichVuService.findAll());
        return "sudung/dichvu";
    }

    @PostMapping("/api/create")
    @ResponseBody
    public ResponseEntity<?> create(@RequestBody SuDungDichVuReq req) {
        try {
            suDungDichVuService.save(req);
            return ResponseEntity.ok("Đăng ký thành công!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Có lỗi khi đăng ký!");
        }
    }





}
