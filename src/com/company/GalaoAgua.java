package com.company;

public class GalaoAgua extends Produto{
    private Integer litros;
    private String fonte;

    public GalaoAgua() {
    }

    public GalaoAgua(String nome, Integer quantidade, Integer litros, String fonte) {
        super(nome, quantidade);
        this.litros = litros;
        this.fonte = fonte;
    }

    public Integer getLitros() {
        return litros;
    }

    public void setLitros(Integer litros) {
        this.litros = litros;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
}
