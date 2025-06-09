package org.example.thigki.service.dichVu;

import org.example.thigki.dto.req.DichVuReq;
import org.example.thigki.dto.resp.DichVuResp;

import java.util.List;

public interface DichVuService {
    void save(DichVuReq req);
    List<DichVuResp> findAll();
    void deleteById(String MaDV);
}
