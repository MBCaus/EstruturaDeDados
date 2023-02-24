package sptech.school.exerciciointerface;

public class DVD extends Produto{

    private String nome;
    private String gravadora;

    public DVD(int codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        return (super.getPrecoCusto() + (super.getPrecoCusto() * 0.2)) ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return  "Serviço { \n " +
                "Nome: " + nome + "\n" +
                "Gravadora: " + gravadora + "\n" +
                "Valor de Venda: " + getValorVenda() + "\n" +
                " }";
    }

}
