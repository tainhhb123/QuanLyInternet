package org.example.thigki.dto.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KhachHangReq {
    @NotBlank
    @Pattern(regexp = "KH\\d{5}", message = "Mã KH phải có dạng KHxxxxx")
    private String maKH;
    @NotBlank
    private String tenKH;
    @NotBlank
    private String diaChi;
    @Pattern(
            regexp = "^(090\\d{7}|091\\d{7}|\\(84\\)\\+90\\d{7}|\\(84\\)\\+91\\d{7})$",
            message = "Số điện thoại không đúng định dạng!")
    private String soDienThoai;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng!")
    private String email;
}
