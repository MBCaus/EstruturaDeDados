package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AlunoFundamental alunoF = new AlunoFundamental(0123, "Carlos", 10.0, 10.0, 10.0, 10.0);
        AlunoGraduacao alunoG = new AlunoGraduacao(0223, "Gabrel", 10.0, 10.0);
        AlunoPos alunoP = new AlunoPos(0345, "Juaquin", 10.0, 10.0, 10.0);
        Escola escola = new Escola("AraAra", new ArrayList<>());

        escola.adicionaAluno(alunoF);
        escola.adicionaAluno(alunoG);
        escola.adicionaAluno(alunoP);

        escola.exibeTodos();

        escola.exibeAlunosGraduacao();

        escola.exibeAprovados();

        escola.buscaAluno(0123);
    }
}