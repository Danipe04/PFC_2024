package com.example.demo.dtos;

public class IncluirDTO {
    private String bebida;
    private int id_ticket;
    private int numb_pedido;
    private int numb_entregado;

    public IncluirDTO() {
    }

    public IncluirDTO(String bebida, int id_ticket, int numb_pedido, int numb_entregado) {
        this.bebida = bebida;
        this.id_ticket = id_ticket;
        this.numb_pedido = numb_pedido;
        this.numb_entregado = numb_entregado;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String  bebida) {
        this.bebida = bebida;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getNumb_pedido() {
        return numb_pedido;
    }

    public void setNumb_pedido(int numb_pedido) {
        this.numb_pedido = numb_pedido;
    }

    public int getNumb_entregado() {
        return numb_entregado;
    }

    public void setNumb_entregado(int numb_entregado) {
        this.numb_entregado = numb_entregado;
    }
}
