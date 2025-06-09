package org.example.thigki.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SuDungDichVuReq {
    @NotBlank
    @Pattern(regexp = "KH\\d{5}", message = "Mã KH phải có dạng KHxxxxx")
    private String maKH;

    @NotBlank
    @Pattern(regexp = "DV\\d{3}", message = "Mã DV phải có dạng DVxxx")
    private String maDV;

    @NotBlank
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",
            message = "Ngày sử dụng phải có dạng yyyy-MM-dd")
    private String ngaySuDung;

    @NotBlank
    @Pattern(regexp = "([01]\\d|2[0-3]):[0-5]\\d",
            message = "Giờ sử dụng phải có dạng HH:mm")
    private String gioSuDung;

    @NotNull
    @Positive(message = "Số lượng phải là số dương")
    private Integer soLuong;
}
