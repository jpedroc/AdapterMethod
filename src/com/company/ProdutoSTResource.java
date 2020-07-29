package com.company;

public class ProdutoSTResource {

    public void AdicionarEstoque(Integer quantidade, Produto produto){
        produto.setQuantidade(produto.getQuantidade() + quantidade);
        System.out.println("PRODUTO ST = Foram adicionados " + quantidade.toString() + " "+ produto.getNome());
    }

    public void RemoverEstoque(Integer quantidade, Produto produto){
        produto.setQuantidade(produto.getQuantidade() - quantidade);
        System.out.println("PRODUTO ST = Foram removidos " + quantidade.toString() + " "+ produto.getNome());
    }

}
