package org.example;

public class Main {

    public static void main(String[] args) {

        Celular celular = new Celular("Motorola", 123, 3_600.0, 8.5);
        Videogame videogame = new Videogame("Playstation", 456, 5_200.0, 30.0);
        Televisao televisao = new Televisao("LG", 789, 2_600.0, 30);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarObjeto(celular);
        carrinho.adicionarObjeto(videogame);
        carrinho.adicionarObjeto(televisao);

        carrinho.exibeConteudo();

        carrinho.calculaTotal();

    }

}