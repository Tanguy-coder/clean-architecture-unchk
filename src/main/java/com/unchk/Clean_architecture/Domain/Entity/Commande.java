package com.unchk.Clean_architecture.Domain.Entity;

import com.unchk.Clean_architecture.Domain.Enum.CommandStatus;

import java.util.Date;

public class Commande extends AbstractEntity{
    private String numero;
    private Date date_comande;
    private Integer qty;
    private CommandStatus status;

    public Commande() {
    }

    public Commande(String numero, Date date_comande, Integer qty, CommandStatus status) {
        this.numero = numero;
        this.date_comande = date_comande;
        this.qty = qty;
        this.status = status;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate_comande() {
        return date_comande;
    }

    public void setDate_comande(Date date_comande) {
        this.date_comande = date_comande;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public CommandStatus getStatus() {
        return status;
    }

    public void setStatus(CommandStatus status) {
        this.status = status;
    }
}
