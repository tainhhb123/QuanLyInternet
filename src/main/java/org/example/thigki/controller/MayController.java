package org.example.thigki.controller;

import jakarta.validation.Valid;
import org.example.thigki.dto.req.MayReq;
import org.example.thigki.service.may.MayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/may")
public class MayController {
    @Autowired
    private MayService mayService;

    // Trả về giao diện HTML
    @GetMapping("/create")
    public String showCreateMay() {
        return "may/create"; // render view
    }

    @GetMapping("/list")
    public String showListMay(Model model) {
        model.addAttribute("listMay", mayService.findAll());
        return "may/list"; // render view
    }   // Trả về giao diện HTML danh sách (nếu muốn)


    // Trả về API (JSON)
    @PostMapping("/api/create")
    @ResponseBody
    public ResponseEntity<?> create(@Valid @RequestBody MayReq req, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        mayService.save(req);
        return ResponseEntity.ok("Thêm máy thành công!");
    }

    // API lấy danh sách
    @GetMapping("/api/list")
    @ResponseBody
    public ResponseEntity<?> apiList() {
        return ResponseEntity.ok(mayService.findAll());
    }


    //xóa
    @DeleteMapping("/api/delete/{maMay}")
    @ResponseBody
    public ResponseEntity<?> deleteMay(@PathVariable String maMay) {
        try {
            mayService.deleteById(maMay); // bạn tự tạo hàm này trong service/repo
            return ResponseEntity.ok("Xóa thành công!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Xóa thất bại!");
        }
    }
}
