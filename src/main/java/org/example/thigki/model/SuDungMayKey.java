package org.example.thigki.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Embeddable
@Data
@NoArgsConstructor
public class SuDungMayKey implements Serializable {
    private String maKH;
    private String maMay;
    private LocalDate ngayBatDauSuDung;
    private LocalTime gioBatDauSuDung;
}