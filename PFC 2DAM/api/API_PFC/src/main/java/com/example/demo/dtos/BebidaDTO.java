package com.example.demo.dtos;

public class BebidaDTO {
    private int id_bebida;
    private String nombre_bebida;

    public BebidaDTO() {
    }

    public BebidaDTO(int id_bebida, String nombre_bebida) {
        this.id_bebida = id_bebida;
        this.nombre_bebida = nombre_bebida;
    }

    public int getId_bebida() {
        return id_bebida;
    }

    public void setId_bebida(int id_bebida) {
        this.id_bebida = id_bebida;
    }

    public String getNombre_bebida() {
        return nombre_bebida;
    }

    public void setNombre_bebida(String nombre_bebida) {
        this.nombre_bebida = nombre_bebida;
    }
}
