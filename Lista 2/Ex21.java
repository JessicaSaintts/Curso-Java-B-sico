package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantidade de turmas: ");
		int turmas = scan.nextInt();

		int qtdAlunos;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i <= turmas; i++) {
			
			do {
				System.out.println("Quantidade de alunos: ");
				qtdAlunos = scan.nextInt();

				if (qtdAlunos <= 40) {
					invalido = false;
				}else {
					System.out.println("Número de alunos inválido. Digite novamente ");
				}
			} while (invalido);
			
			soma += qtdAlunos;
		}
		
		double media = soma / turmas;
		System.out.println("Média: " + media);

	}

}
