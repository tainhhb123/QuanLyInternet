package org.example.thigki.service.may;

import org.example.thigki.dto.req.MayReq;
import org.example.thigki.dto.resp.MayResp;
import org.example.thigki.model.May;
import org.example.thigki.repository.MayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MayServiceImpl implements MayService {
    @Autowired
    private MayRepository mayRepository;

    @Override
    public void save(MayReq req) {
        May may = new May();
        may.setMaMay(req.getMaMay());
        may.setViTri(req.getViTri());
        may.setTrangThai(req.getTrangThai());
        mayRepository.save(may);
    }

    @Override
    public List<MayResp> findAll() {
        return mayRepository.findAll().stream().map(entity -> {
            MayResp resp = new MayResp();
            resp.setMaMay(entity.getMaMay());
            resp.setViTri(entity.getViTri());
            resp.setTrangThai(entity.getTrangThai());
            return resp;
        }).collect(Collectors.toList());
    }
    //xóa
    @Override
    public void deleteById(String maMay) {
        mayRepository.deleteById(maMay);
    }
}
