package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		boolean primo;
		
		for(int i = 1; i < n; i++) {
			primo = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					//System.out.println("Não é primo, é divisível por " + i);
					primo = false;
					//break;
				}
			}
			
			if (primo) {
				System.out.println(i);
			}
		}

	}

}
