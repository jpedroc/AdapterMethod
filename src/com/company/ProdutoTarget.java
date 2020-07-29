package com.company;

public interface ProdutoTarget {
    void incrementarEstoque(Integer quantidade, Produto produto);
    void decrementarEstoque(Integer quantidade, Produto produto);
}
