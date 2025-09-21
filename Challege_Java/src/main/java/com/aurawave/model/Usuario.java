package com.aurawave.model;

public class Usuario {
    private String uuid;
    private String nome;
    private String email;
    private String nivel;
    public Usuario() {}
    public Usuario(String uuid, String nome, String email, String nivel){
        this.uuid=uuid; this.nome=nome; this.email=email; this.nivel=nivel;
    }
    public String getUuid(){return uuid;} public void setUuid(String uuid){this.uuid=uuid;}
    public String getNome(){return nome;} public void setNome(String nome){this.nome=nome;}
    public String getEmail(){return email;} public void setEmail(String email){this.email=email;}
    public String getNivel(){return nivel;} public void setNivel(String nivel){this.nivel=nivel;}
}
