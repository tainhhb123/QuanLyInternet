package org.example.thigki.service.thongTinKhachHang;

import org.example.thigki.dto.resp.ThongTinKhachHangFullResp;
import org.example.thigki.repository.ThongTinKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ThongTinKhachHangService {
    List<ThongTinKhachHangFullResp> getAllThongTinKhachHang();
}