package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double n1 = scan.nextDouble();
		
		if (n1 >=0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		

	}

}
