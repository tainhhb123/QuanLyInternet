package org.example.thigki.controller;

import jakarta.validation.Valid;
import org.example.thigki.dto.req.DichVuReq;
import org.example.thigki.service.dichVu.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dichvu")
public class DichVuController {
    @Autowired
    private DichVuService dichVuService;

    @GetMapping("/create")
    public String showCreateDichVu() {
        return "dichvu/create";
    }

    @GetMapping("/list")
    public String showListDichVu(Model model) {
        model.addAttribute("dichVuList", dichVuService.findAll());
        return "dichvu/list";
    }

    @PostMapping("/api/create")
    @ResponseBody
    public ResponseEntity<?> create(@Valid @RequestBody DichVuReq req, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        dichVuService.save(req);
        return ResponseEntity.ok("them thanh cong");
    }

    @GetMapping("api/list")
    @ResponseBody
    public ResponseEntity<?> apiList() {
        return ResponseEntity.ok(dichVuService.findAll());
    }

    @DeleteMapping("/api/delete/{maDV}")
    @ResponseBody
    public ResponseEntity<?> deleteDichVu(@PathVariable String maDV) {
        try {
            dichVuService.deleteById(maDV);
            return ResponseEntity.ok("xoa thanh cong");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("xoa that bat");
        }
    }


}
