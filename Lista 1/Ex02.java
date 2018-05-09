package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n1 = scan.nextDouble();
		
		if (n1 >=0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		

	}

}
