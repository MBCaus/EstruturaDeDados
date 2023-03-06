package org.example;

public class Televisao extends Eletronico{

    private Integer polegadas;

    public Televisao(String marca, int id, Double preco, Integer polegadas) {
        super(marca, id, preco);
        this.polegadas = polegadas;
    }

    @Override
    public Double calcularTaxa() {
        Double taxa = getPreco() * 0.3;
        super.setPreco((getPreco() + polegadas) + taxa);

        return super.getPreco();
    }

    public Integer getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(Integer qtdPixels) {
        this.polegadas = qtdPixels;
    }

    @Override
    public String toString() {
        return "Televisao { \n" +
                "Polegadas da TV: " + polegadas + "\n" +
                "Preço total com taxa: " + calcularTaxa() +
                "\n } ";
    }
}
