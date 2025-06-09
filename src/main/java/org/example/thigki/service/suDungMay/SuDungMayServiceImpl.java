package org.example.thigki.service.suDungMay;

import org.example.thigki.dto.req.SuDungMayReq;
import org.example.thigki.model.SuDungMay;
import org.example.thigki.model.SuDungMayKey;
import org.example.thigki.repository.KhachHangRepository;
import org.example.thigki.repository.MayRepository;
import org.example.thigki.repository.SuDungMayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class SuDungMayServiceImpl implements SuDungMayService{
    @Autowired
    private SuDungMayRepository suDungMayRepository;

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private MayRepository mayRepository;

    @Override
    public void save(SuDungMayReq req) {
        SuDungMayKey key = new SuDungMayKey();
        key.setMaKH(req.getMaKH());
        key.setMaMay(req.getMaMay());
        key.setNgayBatDauSuDung(LocalDate.parse(req.getNgayBatDauSuDung()));
        key.setGioBatDauSuDung(LocalTime.parse(req.getGioBatDauSuDung()));

        SuDungMay entity = new SuDungMay();
        entity.setId(key);
        entity.setThoiGianSuDung(req.getThoiGianSuDung());

        // Nếu cần set relationship (không bắt buộc, chỉ để truy xuất nhanh)
        entity.setKhachHang(khachHangRepository.findById(req.getMaKH()).orElse(null));
        entity.setMay(mayRepository.findById(req.getMaMay()).orElse(null));

        suDungMayRepository.save(entity);
    }
}
