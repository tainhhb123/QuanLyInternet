package org.example.thigki.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class SuDungDichVu {
    @EmbeddedId
    private SuDungDichVuKey id;

    @ManyToOne
    @MapsId("maKH")
    @JoinColumn(name = "maKH")
    private KhachHang khachHang;

    @ManyToOne
    @MapsId("maDV")
    @JoinColumn(name = "maDV")
    private DichVu dichVu;

    private Integer soLuong;
}