package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Eletronico> carrinho = new ArrayList();

    public void adicionarObjeto(Eletronico objeto){
        carrinho.add(objeto);
    }

    public void exibeConteudo(){
        for (Eletronico objetos : carrinho) {
            System.out.println(objetos);
        }
    }

    public void calculaTotal(){
        Double totalCarrinho = 0.0;
        for (Eletronico objetos : carrinho) {
            totalCarrinho += objetos.getPreco();
        }
        System.out.println("O preço total do carrinho é: " + totalCarrinho);
    }

}
