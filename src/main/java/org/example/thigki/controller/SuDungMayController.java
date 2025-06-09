package org.example.thigki.controller;

import org.example.thigki.dto.req.SuDungMayReq;
import org.example.thigki.service.khachHang.KhachHangService;
import org.example.thigki.service.may.MayService;
import org.example.thigki.service.suDungMay.SuDungMayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sudungmay")
public class SuDungMayController {
    @Autowired
    private SuDungMayService suDungMayService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private MayService mayService;

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("khachHangList", khachHangService.findAll());
        model.addAttribute("mayList", mayService.findAll());
        return "sudung/may";
    }

    @PostMapping("/api/create")
    @ResponseBody
    public ResponseEntity<?> create(@RequestBody SuDungMayReq req) {
        try {
            suDungMayService.save(req);
            return ResponseEntity.ok("Đăng ký thành công!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Có lỗi khi đăng ký!");
        }
    }
}
