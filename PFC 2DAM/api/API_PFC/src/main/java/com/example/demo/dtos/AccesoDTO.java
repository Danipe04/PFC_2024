package com.example.demo.dtos;

public class AccesoDTO {
    private String nombreUsuario;
    private String claveAcceso;

    public AccesoDTO() {
    }

    public AccesoDTO(String nombreUsuario, String claveaAcceso) {
        this.nombreUsuario = nombreUsuario;
        this.claveAcceso = claveaAcceso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
        return "AccesoDTO{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", claveAcesso='" + claveAcceso + '\'' +
                '}';
    }
}
