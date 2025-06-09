package org.example.thigki.dto.resp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KhachHangResp {
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String soDienThoai;
    private String email;
}
