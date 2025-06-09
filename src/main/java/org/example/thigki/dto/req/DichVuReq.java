package org.example.thigki.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class DichVuReq {
    @NotBlank
    private String maDV;

    @NotBlank
    private String tenDV;

    @NotBlank
    private String donViTinh;

    @NotNull
    private Double donGia;
}
