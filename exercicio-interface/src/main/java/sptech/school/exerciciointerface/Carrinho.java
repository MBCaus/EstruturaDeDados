package sptech.school.exerciciointerface;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> carrinho;

    public Carrinho() {
        this.carrinho = new ArrayList();
    }

    public void adicionaVendavel(Vendavel v) {
        carrinho.add(v);
    }

    public Double calculaTotalVenda(){
        Double total = 0.0;

        for (Vendavel carro : carrinho) {
            total += carro.getValorVenda();
        }

        return total;
    }

    public void exibeItensCarrinho(){

        for (Vendavel carro : carrinho) {
            System.out.println(carro.toString());
        }

    }

}
