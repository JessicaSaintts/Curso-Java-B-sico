package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preço do pão: R$ ");
		double preco = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		for(int i = 1; i <=50; i++) {
			System.out.println(i + " - R$ " + (i * preco));
		}

	}

}
