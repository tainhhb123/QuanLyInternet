package org.example.thigki.dto.req;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
public class SuDungDichVuReq {
    private String maKH;
    private String maDV;
    private String ngaySuDung;
    private String gioSuDung;
    private Integer soLuong;
}
