package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int maior = Integer.MIN_VALUE; //menor valor do java
		// pode ser int maior = -1;
		for (int i = 0; i< 5; i++) {
			System.out.println("Número: ");
			n = scan.nextInt();
			
			if (n > maior) {
				maior = n;
			}
		}
		
		System.out.println("Número maior é " + maior);
	}

}
