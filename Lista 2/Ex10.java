package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, n1, n2;
		
		System.out.println("1º Número: ");
		n1 = scan.nextInt();
		
		System.out.println("2º Número: ");
		n2 = scan.nextInt();
		
		for (i = n1; i < n2; i++) {
			System.out.println(i);
		}

	}

}
