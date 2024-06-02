package com.example.demo.dtos;

public class ComidaDTO {
    private int id_comida;
    private String nombre_comida;

    public ComidaDTO() {
    }

    public ComidaDTO(int id_comida, String nombre_comida) {
        this.id_comida = id_comida;
        this.nombre_comida = nombre_comida;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public String getNombre_comida() {
        return nombre_comida;
    }

    public void setNombre_comida(String nombre_comida) {
        this.nombre_comida = nombre_comida;
    }
}
