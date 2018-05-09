package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de cd's: ");
		int qtdCd = scan.nextInt();
		
		double preco;
		int soma = 0;
		
		for(int i = 0; i < qtdCd; i++) {
			System.out.println("Digite o preço do cd " + (i + 1));
			preco = scan.nextDouble();
			
			soma += preco;
		}
		
		double media = soma / qtdCd;
		System.out.println("Valor total investido: R$ " + soma);
		System.out.println("Valor médio gasto: " + media);
	}

}
