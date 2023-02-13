package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> lista;

    public Escola(String nome, List<Aluno> aluno) {
        this.nome = nome;
        this.lista = aluno;
    }

    public void adicionaAluno(Aluno aluno){
        lista.add(aluno);
    }

    public void exibeTodos() {

        for (Aluno lista : lista) {
            System.out.println(lista);
        }

    }

    public void exibeAlunosGraduacao() {

        System.out.println("ALUNOS GRADUADOS: ");

        for (Aluno lista : lista) {

            if(lista.getRa().equals(0223)) {
                System.out.println(lista);

            }
        }

    }

    public void exibeAprovados(){

        System.out.println("ALUNOS APROVADOS: ");

        for (Aluno lista : lista) {
            if(lista.calculaMedia() >= 6) {
                System.out.println(lista);
            }
        }

    }

    public void buscaAluno(Integer ra){

        System.out.println("BUSCAR ALUNOS: ");

        for (Aluno lista : lista) {
            if(lista.getRa().equals(ra)) {
                System.out.println(lista);
            }
        }
    }

}
