package sptech.school.exerciciointerface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TesteCarrinho {

	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();
		Integer escolha = 999;
		Scanner leitor = new Scanner(System.in);
		Scanner enter = new Scanner(System.in);

		while (escolha != 0) {
			System.out.println("[1] - Adicionar Livro \n" +
							   "[2] - Adicionar DVD \n" +
					           "[3] - Adicionar Serviço \n" +
							   "[4] - Exibir itens do carrinho \n" +
							   "[5] - Exibir total de venda \n" +
							   "[0] - Encerrar");

			escolha = leitor.nextInt();

			switch (escolha) {
				case 1 -> {

					System.out.println("Digite o Código do Livro: ");
					Integer codigo = leitor.nextInt();
					System.out.println("Digite o preço do Livro: ");
					double preco = leitor.nextDouble();
					System.out.println("Digite o nome do Livro: ");
					String nome = leitor.nextLine();
					System.out.println("Digite o autor do Livro: ");
					String autor = leitor.nextLine();
					System.out.println("Digite o isbn do Livro: ");
					String isbn = leitor.nextLine();

					Livro livro = new Livro(codigo, preco, nome, autor, isbn);
				}
				case 2 -> {

					System.out.println("Digite o Código do DVD: ");
					Integer codigo = leitor.nextInt();
					System.out.println("Digite o preço do DVD: ");
					Double preco = leitor.nextDouble();
					System.out.println("Digite o nome do DVD: ");
					String nome = leitor.nextLine();
					System.out.println("Digite a gravadora do DVD: ");
					String gravadora = leitor.nextLine();

					DVD dvd = new DVD(codigo, preco, nome, gravadora);

				}
				case 3 -> {

					System.out.println("Digite a descrição do Serviço: ");
					String descricao = leitor.nextLine();
					System.out.println("Digite o código do Serviço: ");
					Integer codigo = leitor.nextInt();
					System.out.println("Digite a quantidade de horas do Serviço: ");
					Integer qtdHoras = leitor.nextInt();
					System.out.println("Digite o valor da hora de Serviço: ");
					Double valorHora = leitor.nextDouble();

					Servico servico = new Servico(descricao, codigo, qtdHoras, valorHora);

				}
				case 4 -> carrinho.exibeItensCarrinho();
				case 5 -> carrinho.calculaTotalVenda();
			}

		}

	}

}
