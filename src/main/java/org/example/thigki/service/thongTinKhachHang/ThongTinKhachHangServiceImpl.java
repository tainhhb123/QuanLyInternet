package org.example.thigki.service.thongTinKhachHang;

import org.example.thigki.dto.resp.ThongTinKhachHangFullResp;
import org.example.thigki.repository.ThongTinKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThongTinKhachHangServiceImpl implements ThongTinKhachHangService {
    @Autowired
    private ThongTinKhachHangRepository repo;

    @Override
    public List<ThongTinKhachHangFullResp> getAllThongTinKhachHang() {
        return repo.getAllThongTinKhachHang();
    }
}