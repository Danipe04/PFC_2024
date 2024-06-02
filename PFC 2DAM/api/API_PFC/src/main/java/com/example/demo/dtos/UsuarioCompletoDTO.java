package com.example.demo.dtos;

import java.util.List;

public class UsuarioCompletoDTO {
    private int id_usuario;
    private String nombre;
    private String apellidos;
    private List<String> roles;

    public UsuarioCompletoDTO() {
    }

    public UsuarioCompletoDTO(int id_usuario, String nombre, String apellidos, List<String> roles) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.roles = roles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
