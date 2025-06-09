package org.example.thigki.repository;

import org.aspectj.apache.bcel.util.Repository;
import org.example.thigki.dto.resp.ThongTinKhachHangFullResp;
import org.example.thigki.model.SuDungDichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ThongTinKhachHangRepository extends CrudRepository<SuDungDichVu, /* type của khóa chính */ Object> {
    @Query("""
    SELECT new org.example.thigki.dto.resp.ThongTinKhachHangFullResp(
        kh.maKH, kh.tenKH,
        m.maMay, m.viTri, m.trangThai,
        sdm.id.ngayBatDauSuDung, sdm.id.gioBatDauSuDung, sdm.thoiGianSuDung,
        sdv.dichVu.maDV, sdv.id.ngaySuDung, sdv.id.gioSuDung, sdv.soLuong,
        (sdv.soLuong * 1.0 * sdv.dichVu.donGia)
    )
    FROM SuDungDichVu sdv
    JOIN sdv.khachHang kh
    JOIN SuDungMay sdm ON sdm.khachHang.maKH = kh.maKH
    JOIN sdm.may m
""")
    List<ThongTinKhachHangFullResp> getAllThongTinKhachHang();
}