package com.company;

public class BotijaGas extends Produto{
    private Integer kilos;
    private String distribuidora;

    public BotijaGas() {
    }

    public BotijaGas(String nome, Integer quantidade, Integer kilos, String distribuidora) {
        super(nome, quantidade);
        this.kilos = kilos;
        this.distribuidora = distribuidora;
    }

    public Integer getKilos() {
        return kilos;
    }

    public void setKilos(Integer kilos) {
        this.kilos = kilos;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }
}
