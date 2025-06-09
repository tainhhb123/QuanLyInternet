package org.example.thigki.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class SuDungMay {
    @EmbeddedId
    private SuDungMayKey id;

    @ManyToOne
    @MapsId("maKH")
    @JoinColumn(name = "maKH")
    private KhachHang khachHang;

    @ManyToOne
    @MapsId("maMay")
    @JoinColumn(name = "mamay")
    private May may;

    private Integer thoiGianSuDung;
}