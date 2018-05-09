package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		System.out.println("Fatorial de " + n);
		
		System.out.print(n + "! = ");
		
		int fat = 1;
		
		for (int i = n; i > 1; i--) {
			fat = fat * i;
			System.out.print(i + " . ");
		}
		System.out.print(" 1 = " + fat);

	}

}
