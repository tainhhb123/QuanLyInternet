package org.example.thigki.controller;



import jakarta.validation.Valid;
import org.example.thigki.dto.req.KhachHangReq;
import org.example.thigki.service.khachHang.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("khachHangReq", new KhachHangReq());
        return "khachhang/create";
    }

    @GetMapping("/list")
    public String showListKhachHang(Model model) {
        model.addAttribute("listKhach", khachHangService.findAll());
        return "khachhang/list";
    }

    @PostMapping("api/create")
    @ResponseBody
    public ResponseEntity<?> create(@Valid @RequestBody KhachHangReq req, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        khachHangService.save(req);
        return ResponseEntity.ok("Them khach hang thanh cong");
    }

    // API lấy danh sách
    @GetMapping("/api/list")
    @ResponseBody
    public ResponseEntity<?> apiList() {
        return ResponseEntity.ok(khachHangService.findAll());
    }


    //xoas
    @DeleteMapping("api/delete/{maKH}")
    @ResponseBody
    public ResponseEntity<?> delete(@PathVariable String maKH) {
        try {
            khachHangService.deleteById(maKH);
            return ResponseEntity.ok("xoas thanh cong");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Xoa that bai");
        }
    }
}
