package org.example.thigki.service.khachHang;


import org.example.thigki.dto.req.KhachHangReq;
import org.example.thigki.dto.resp.KhachHangResp;
import org.example.thigki.model.KhachHang;
import org.example.thigki.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public void save(KhachHangReq req) {
        KhachHang kh = new KhachHang();
        kh.setMaKH(req.getMaKH());
        kh.setTenKH(req.getTenKH());
        kh.setDiaChi(req.getDiaChi());
        kh.setSoDienThoai(req.getSoDienThoai());
        kh.setEmail(req.getEmail());
        khachHangRepository.save(kh);
    }

    @Override
    public List<KhachHangResp> findAll() {
        return khachHangRepository.findAll().stream().map(entity -> {
            KhachHangResp resp = new KhachHangResp();
            resp.setMaKH(entity.getMaKH());
            resp.setTenKH(entity.getTenKH());
            resp.setDiaChi(entity.getDiaChi());
            resp.setSoDienThoai(entity.getSoDienThoai());
            resp.setEmail(entity.getEmail());
            return resp;
        }).collect(Collectors.toList());
    }
    @Override
    public void deleteById(String maKH) {
        khachHangRepository.deleteById(maKH);
    }
}