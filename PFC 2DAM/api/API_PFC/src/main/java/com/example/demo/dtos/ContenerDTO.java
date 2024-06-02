package com.example.demo.dtos;

public class ContenerDTO {
    private String postre;
    private int id_ticket;
    private int nump_pedido;
    private int nump_entregado;

    public ContenerDTO() {
    }

    public ContenerDTO(String postre, int id_ticket, int nump_pedido, int nump_entregado) {
        this.postre = postre;
        this.id_ticket = id_ticket;
        this.nump_pedido = nump_pedido;
        this.nump_entregado = nump_entregado;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getNump_pedido() {
        return nump_pedido;
    }

    public void setNump_pedido(int nump_pedido) {
        this.nump_pedido = nump_pedido;
    }

    public int getNump_entregado() {
        return nump_entregado;
    }

    public void setNump_entregado(int nump_entregado) {
        this.nump_entregado = nump_entregado;
    }
}
