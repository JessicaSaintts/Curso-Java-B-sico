package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles. 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� numero: ");
		int n1 = scan.nextInt();
		
		System.out.println("2� numero: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior � " + n1);
		}
		else {
			System.out.println("O maior � " + n2);
		}
		

	}

}
