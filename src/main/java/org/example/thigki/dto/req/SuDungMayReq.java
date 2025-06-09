package org.example.thigki.dto.req;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SuDungMayReq {
    private String maKH;
    private String maMay;
    private String ngayBatDauSuDung; // dùng String hoặc LocalDate, frontend sẽ gửi yyyy-MM-dd
    private String gioBatDauSuDung;  // dùng String hoặc LocalTime, frontend sẽ gửi HH:mm
    private Integer thoiGianSuDung;
}