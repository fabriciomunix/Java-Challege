package com.aurawave.model;

import java.time.LocalDateTime;

public class Medicao {
    private String uuid;
    private String uuidAmostra;
    private double comprimentoMm;
    private double larguraMm;
    private double alturaMm;
    private double areaMm2;
    private double volumeMm3;
    private String metodo;
    private LocalDateTime dataMedicao;

    public Medicao() {}
    public Medicao(String uuid, String uuidAmostra, double comprimentoMm, double larguraMm, double alturaMm, String metodo, LocalDateTime dataMedicao) {
        this.uuid=uuid; this.uuidAmostra=uuidAmostra; this.comprimentoMm=comprimentoMm; this.larguraMm=larguraMm; this.alturaMm=alturaMm;
        this.areaMm2 = comprimentoMm * larguraMm;
        this.volumeMm3 = this.areaMm2 * alturaMm;
        this.metodo=metodo; this.dataMedicao=dataMedicao;
    }
    public String getUuid(){return uuid;} public void setUuid(String uuid){this.uuid=uuid;}
    public String getUuidAmostra(){return uuidAmostra;} public void setUuidAmostra(String uuidAmostra){this.uuidAmostra=uuidAmostra;}
    public double getComprimentoMm(){return comprimentoMm;} public void setComprimentoMm(double v){this.comprimentoMm=v;}
    public double getLarguraMm(){return larguraMm;} public void setLarguraMm(double v){this.larguraMm=v;}
    public double getAlturaMm(){return alturaMm;} public void setAlturaMm(double v){this.alturaMm=v;}
    public double getAreaMm2(){return areaMm2;}
    public double getVolumeMm3(){return volumeMm3;}
    public String getMetodo(){return metodo;} public void setMetodo(String metodo){this.metodo=metodo;}
    public LocalDateTime getDataMedicao(){return dataMedicao;} public void setDataMedicao(LocalDateTime d){this.dataMedicao=d;}
}
