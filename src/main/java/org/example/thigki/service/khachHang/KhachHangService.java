package org.example.thigki.service.khachHang;


import org.example.thigki.dto.req.KhachHangReq;
import org.example.thigki.dto.resp.KhachHangResp;

import java.util.List;

public interface KhachHangService {
    void save(KhachHangReq req);
    List<KhachHangResp> findAll();
    void deleteById(String maKH);
}
