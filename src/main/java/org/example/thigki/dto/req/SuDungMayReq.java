package org.example.thigki.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SuDungMayReq {
    @NotBlank
    @Pattern(regexp = "KH\\d{5}", message = "Mã KH phải có dạng KHxxxxx")
    private String maKH;

    @NotBlank
    private String maMay;

    @NotBlank
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",
            message = "Ngày bắt đầu phải có dạng yyyy-MM-dd")
    private String ngayBatDauSuDung; // frontend gửi yyyy-MM-dd

    @NotBlank
    @Pattern(regexp = "([01]\\d|2[0-3]):[0-5]\\d",
            message = "Giờ bắt đầu phải có dạng HH:mm")
    private String gioBatDauSuDung;  // frontend gửi HH:mm

    @NotNull
    @Positive(message = "Thời gian sử dụng phải là số dương")
    private Integer thoiGianSuDung;
}