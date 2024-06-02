package com.example.demo.dtos;

public class TenerDTO {
    private String comida;
    private int id_ticket;
    private int numc_pedido;
    private int numc_entregado;

    public TenerDTO() {
    }

    public TenerDTO(String comida, int id_ticket, int numc_pedido, int numc_entregado) {
        this.comida = comida;
        this.id_ticket = id_ticket;
        this.numc_pedido = numc_pedido;
        this.numc_entregado = numc_entregado;
    }

    public String  getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getNumc_pedido() {
        return numc_pedido;
    }

    public void setNumc_pedido(int numc_pedido) {
        this.numc_pedido = numc_pedido;
    }

    public int getNumc_entregado() {
        return numc_entregado;
    }

    public void setNumc_entregado(int numc_entregado) {
        this.numc_entregado = numc_entregado;
    }
}
