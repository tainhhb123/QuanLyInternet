package org.example.thigki.dto.resp;

import java.time.LocalDate;
import java.time.LocalTime;

public class ThongTinKhachHangFullResp {
    public String maKH;
    public String tenKH;
    public String maMay;
    public String viTri;
    public String trangThai;
    public LocalDate ngayBatDauSuDung;
    public LocalTime gioBatDauSuDung;
    public Integer thoiGianSuDung;
    public String maDV;
    public LocalDate ngaySuDung;
    public LocalTime gioSuDung;
    public Integer soLuong;
    public Double tongTien;

    public ThongTinKhachHangFullResp(
            String maKH,
            String tenKH,
            String maMay,
            String viTri,
            String trangThai,
            LocalDate ngayBatDauSuDung,
            LocalTime gioBatDauSuDung,
            Integer thoiGianSuDung,
            String maDV,
            LocalDate ngaySuDung,
            LocalTime gioSuDung,
            Integer soLuong,
            Double tongTien
    ) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maMay = maMay;
        this.viTri = viTri;
        this.trangThai = trangThai;
        this.ngayBatDauSuDung = ngayBatDauSuDung;
        this.gioBatDauSuDung = gioBatDauSuDung;
        this.thoiGianSuDung = thoiGianSuDung;
        this.maDV = maDV;
        this.ngaySuDung = ngaySuDung;
        this.gioSuDung = gioSuDung;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }
}
