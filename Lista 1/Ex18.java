package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número: ");
		double n = scan.nextDouble();
		
		if (n % 2 == 0){
			System.out.println("Par");
		}else {
			System.out.println("Ímpar");
		}

	}

}
