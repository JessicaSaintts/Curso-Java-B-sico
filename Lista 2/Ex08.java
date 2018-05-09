package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		double media;
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Número: ");
			n = scan.nextInt();
			
			soma += n;
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma/5);
	}

}
