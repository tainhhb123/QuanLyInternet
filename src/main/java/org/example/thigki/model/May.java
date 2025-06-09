package org.example.thigki.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class May {
    @Id
    private String maMay;
    private String viTri;
    private String trangThai;
}