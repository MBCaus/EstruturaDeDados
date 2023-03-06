package org.example;

public abstract class Eletronico {

    private String marca;
    private int id;
    private Double preco;

    public Eletronico(String marca, int id, Double preco) {
        this.marca = marca;
        this.id = id;
        this.preco = preco;
    }

    public Double calcularTaxa(){
        return null;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
