package org.example.thigki.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class KhachHang {
    @Id
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String soDienThoai;
    private String email;
}