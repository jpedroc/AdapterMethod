package com.company;

public class ProdutoPJResource {

    public void AdicionarEstoque(Integer quantidade, Produto produto){
        produto.setQuantidade(produto.getQuantidade() + quantidade);
        System.out.println("PRODUTO PJ = Foram adicionados " + quantidade.toString() + " "+ produto.getNome());
    }

    public void RemoverEstoque(Integer quantidade, Produto produto){
        produto.setQuantidade(produto.getQuantidade() - quantidade);
        System.out.println("PRODUTO PJ = Foram removidos " + quantidade.toString() + " "+ produto.getNome());
    }

}
