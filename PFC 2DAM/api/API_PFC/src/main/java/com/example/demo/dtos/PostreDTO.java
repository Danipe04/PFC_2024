package com.example.demo.dtos;

public class PostreDTO {
    private int id_postre;
    private String nombre_postre;

    public PostreDTO() {
    }

    public PostreDTO(int id_postre, String nombre_postre) {
        this.id_postre = id_postre;
        this.nombre_postre = nombre_postre;
    }

    public int getId_postre() {
        return id_postre;
    }

    public void setId_postre(int id_postre) {
        this.id_postre = id_postre;
    }

    public String getNombre_postre() {
        return nombre_postre;
    }

    public void setNombre_postre(String nombre_postre) {
        this.nombre_postre = nombre_postre;
    }
}
