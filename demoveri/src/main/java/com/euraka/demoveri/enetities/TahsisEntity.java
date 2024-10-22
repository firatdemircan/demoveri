package com.euraka.demoveri.enetities;

import jakarta.persistence.*;

@Entity
public class TahsisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "depo_entity_id")
    private DepoEntity depoEntity;

    @ManyToOne
    @JoinColumn(name = "urun_entity_id")
    private UrunEntity urunEntity;

    @ManyToOne
    @JoinColumn(name = "firma_entity_id")
    private FirmaEntity firmaEntity;

    private String guncelleyenAdi;



}
