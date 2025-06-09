package org.example.thigki.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class DichVu {
    @Id
    private String maDV;
    private String tenDV;
    private String donViTinh;
    private Double donGia;
}