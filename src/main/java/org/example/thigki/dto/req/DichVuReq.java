package org.example.thigki.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class DichVuReq {
    @NotBlank
    @Pattern(regexp = "DV\\d{3}", message = "Mã DV phải có dạng DVxxx")
    private String maDV;

    @NotBlank
    private String tenDV;

    @NotBlank
    private String donViTinh;

    @NotNull
    @Positive(message = "Đơn giá phải là số dương")
    private Double donGia;
}
