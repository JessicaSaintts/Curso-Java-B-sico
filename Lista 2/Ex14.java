package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, i, pares = 0, impares = 0;

		for(i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			n = scan.nextInt();
			
			if (i % 2 == 0) {
				pares ++;
			}else {
				impares++;
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Ímpares: " + impares);
	}

}
