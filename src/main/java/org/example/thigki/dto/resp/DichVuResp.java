package org.example.thigki.dto.resp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DichVuResp {
    private String maDV;
    private String tenDV;
    private String donViTinh;
    private Double donGia;
}
