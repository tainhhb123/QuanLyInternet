package org.example.thigki.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Embeddable
@Data
@NoArgsConstructor
public class SuDungDichVuKey implements Serializable {
    private String maKH;
    private String maDV;
    private LocalDate ngaySuDung;
    private LocalTime gioSuDung;
}
