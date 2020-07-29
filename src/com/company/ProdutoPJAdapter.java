package com.company;

public class ProdutoPJAdapter extends ProdutoPJResource implements ProdutoTarget {
    @Override
    public void incrementarEstoque(Integer quantidade, Produto produto) {
        AdicionarEstoque(quantidade, produto);
    }

    @Override
    public void decrementarEstoque(Integer quantidade, Produto produto) {
        RemoverEstoque(quantidade, produto);
    }
}
