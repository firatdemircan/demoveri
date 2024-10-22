package com.euraka.demoveri.enetities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class FirmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String vergiNo;
    private String firmaAdi;

    public FirmaEntity() {
    }

    public FirmaEntity(Long id, String vergiNo, String firmaAdi) {
        this.id = id;
        this.vergiNo = vergiNo;
        this.firmaAdi = firmaAdi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }



    @OneToMany(mappedBy = "firmaEntity")
    List<TahsisEntity> tahsisEntities;
}
