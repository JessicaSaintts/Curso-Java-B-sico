package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� Numero: ");
		int n1 = scan.nextInt();
		
		System.out.println("2� Numero: ");
		int n2 = scan.nextInt();
		
		System.out.println("3� Numero: ");
		int n3 = scan.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("Maior numero: " + n1);
		}
		else if (n2 >= n1 && n2 >=n3){
			System.out.println("Maior numero: " + n2);
		}
		else {
			System.out.println("Maior numero: " + n3);
		}
		

	}

}
