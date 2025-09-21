package com.aurawave.model;

import java.time.LocalDateTime;

public class Amostra {
    private String uuid;
    private String codigoInterno;
    private String tipoTecido;
    private LocalDateTime dataColeta;
    private String status;

    public Amostra() {}
    public Amostra(String uuid, String codigoInterno, String tipoTecido, LocalDateTime dataColeta, String status) {
        this.uuid=uuid; this.codigoInterno=codigoInterno; this.tipoTecido=tipoTecido; this.dataColeta=dataColeta; this.status=status;
    }
    public String getUuid(){return uuid;} public void setUuid(String uuid){this.uuid=uuid;}
    public String getCodigoInterno(){return codigoInterno;} public void setCodigoInterno(String codigoInterno){this.codigoInterno=codigoInterno;}
    public String getTipoTecido(){return tipoTecido;} public void setTipoTecido(String tipoTecido){this.tipoTecido=tipoTecido;}
    public LocalDateTime getDataColeta(){return dataColeta;} public void setDataColeta(LocalDateTime dataColeta){this.dataColeta=dataColeta;}
    public String getStatus(){return status;} public void setStatus(String status){this.status=status;}
}
