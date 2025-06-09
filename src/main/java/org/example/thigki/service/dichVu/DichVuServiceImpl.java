package org.example.thigki.service.dichVu;

import org.example.thigki.dto.req.DichVuReq;
import org.example.thigki.dto.resp.DichVuResp;
import org.example.thigki.model.DichVu;
import org.example.thigki.repository.DichVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public void save(DichVuReq req) {
        DichVu dichVu = new DichVu();
        dichVu.setMaDV(req.getMaDV());
        dichVu.setTenDV(req.getTenDV());
        dichVu.setDonViTinh(req.getDonViTinh());
        dichVu.setDonGia(req.getDonGia());
        dichVuRepository.save(dichVu);
    }

    @Override
    public List<DichVuResp> findAll() {
        return dichVuRepository.findAll().stream().map(entity -> {
            DichVuResp resp = new DichVuResp();
            resp.setMaDV(entity.getMaDV());
            resp.setTenDV(entity.getTenDV());
            resp.setDonViTinh(entity.getDonViTinh());
            resp.setDonGia(entity.getDonGia());
            return resp;
        }).collect(Collectors.toList());
    }

    @Override
    public void deleteById (String maDV) {
        dichVuRepository.deleteById(maDV);
    }

}
