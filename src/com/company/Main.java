package com.company;

public class Main {

    public static void main(String[] args) {
	    Produto galao = new GalaoAgua("Galaão Pedra Azul", 15, 10, "Pedra Azul");
	    Produto botija = new BotijaGas("Botija Cheia", 30, 13, "União Distribuidora");;

	    ProdutoTarget produtoAdapter = new ProdutoSTAdapter();
	    produtoAdapter.incrementarEstoque(5, galao);
        produtoAdapter.decrementarEstoque(7, botija);

	    produtoAdapter = new ProdutoPJAdapter();
        produtoAdapter.incrementarEstoque(8, galao);
        produtoAdapter.decrementarEstoque(3, botija);

    }
}
