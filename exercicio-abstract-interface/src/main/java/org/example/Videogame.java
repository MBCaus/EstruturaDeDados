package org.example;

public class Videogame extends Eletronico{

    private Double potenciaProporcional;

    public Videogame(String marca, int id, Double preco, Double potenciaProporcional) {
        super(marca, id, preco);
        this.potenciaProporcional = potenciaProporcional;
    }

    @Override
    public Double calcularTaxa() {
        Double taxa = (getPreco() * 0.4);
        super.setPreco((getPreco() + potenciaProporcional) + taxa);

        return super.getPreco();
    }

    public Double getPotenciaProporcional() {
        return potenciaProporcional;
    }

    public void setPotenciaProporcional(Double potenciaProporcional) {
        this.potenciaProporcional = potenciaProporcional;
    }

    @Override
    public String toString() {
        return  "Videogame { \n" +
                "Potencia do Videogame: " + potenciaProporcional + "\n" +
                "Preço final com taxa: " + calcularTaxa() +
                "\n } ";
    }
}
