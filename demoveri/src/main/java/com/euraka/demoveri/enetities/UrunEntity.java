package com.euraka.demoveri.enetities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UrunEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String urunName;
    private String urunKod;

    @OneToMany(mappedBy = "urunEntity")
    List<TahsisEntity> tahsisEntities;
}
