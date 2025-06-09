package org.example.thigki.service.may;

import org.example.thigki.dto.req.MayReq;
import org.example.thigki.dto.resp.MayResp;

import java.util.List;

public interface MayService {
    void save(MayReq req);
    List<MayResp> findAll();
    void deleteById(String maMay);
}
