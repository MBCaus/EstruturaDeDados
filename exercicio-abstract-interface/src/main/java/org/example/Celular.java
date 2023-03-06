package org.example;

public class Celular extends  Eletronico{

    private Double proporcaoTela;

    public Celular(String marca, int id, Double preco, Double proporcaoTela) {
        super(marca, id, preco);
        this.proporcaoTela = proporcaoTela;
    }

    @Override
    public Double calcularTaxa() {
        Double taxa = (getPreco() * 0.2);
        super.setPreco((getPreco() + proporcaoTela) - taxa);

        return super.getPreco();
    }

    public Double getProporcaoTela() {
        return proporcaoTela;
    }

    public void setProporcaoTela(Double proporcaoTela) {
        this.proporcaoTela = proporcaoTela;
    }

    @Override
    public String toString() {
        return  "Celular { \n" +
                "Tamanho de Tela:" + proporcaoTela + "\n" +
                "Preço final com taxa: " + calcularTaxa() +
                "\n }";
    }
}
