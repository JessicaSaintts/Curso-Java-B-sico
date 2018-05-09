package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				System.out.println("Não é primo, é divisível por " + i);
				primo = false;
				//break;
			}
		}
		
		if (primo) {
			System.out.println("É primo");
		}

	}

}
