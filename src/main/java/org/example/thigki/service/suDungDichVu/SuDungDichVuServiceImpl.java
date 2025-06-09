package org.example.thigki.service.suDungDichVu;

import org.example.thigki.dto.req.SuDungDichVuReq;
import org.example.thigki.model.SuDungDichVu;
import org.example.thigki.model.SuDungDichVuKey;
import org.example.thigki.repository.DichVuRepository;
import org.example.thigki.repository.KhachHangRepository;
import org.example.thigki.repository.SuDungDichVuRepository;
import org.example.thigki.repository.SuDungMayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class SuDungDichVuServiceImpl implements SuDungDichVuService {
    @Autowired
    private SuDungDichVuRepository suDungDichVuRepository;

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public void save(SuDungDichVuReq req) {
        SuDungDichVuKey key = new SuDungDichVuKey();
        key.setMaKH(req.getMaKH());
        key.setMaDV(req.getMaDV());
        key.setNgaySuDung(LocalDate.parse(req.getNgaySuDung()));
        key.setGioSuDung(LocalTime.parse(req.getGioSuDung()));

        SuDungDichVu entity = new SuDungDichVu();
        entity.setId(key);
        entity.setSoLuong(req.getSoLuong());

        entity.setKhachHang(khachHangRepository.findById(req.getMaKH()).orElse(null));
        entity.setDichVu(dichVuRepository.findById(req.getMaDV()).orElse(null));

        suDungDichVuRepository.save(entity);
    }
}
