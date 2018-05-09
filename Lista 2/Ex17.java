package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		int fat = 1;
		
		for (int i = n; i > 0; i--) {
			fat = fat * i;
			System.out.println(i);
		}
		System.out.println("Fatorial: " + fat);
	}

}
