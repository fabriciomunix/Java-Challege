package com.aurawave.service;

public class MedicaoService {
    public double calcularArea(double comprimentoMm, double larguraMm){
        return comprimentoMm * larguraMm;
    }
    public double calcularVolume(double comprimentoMm, double larguraMm, double alturaMm){
        return calcularArea(comprimentoMm, larguraMm) * alturaMm;
    }
}
