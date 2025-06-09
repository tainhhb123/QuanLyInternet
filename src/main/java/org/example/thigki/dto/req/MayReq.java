package org.example.thigki.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class MayReq {
    @NotBlank
    private String maMay;
    @NotBlank
    private String viTri;
    @NotBlank
    private String trangThai;
}
