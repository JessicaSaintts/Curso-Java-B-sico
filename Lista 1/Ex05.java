package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� Nota: ");
		double n1 = scan.nextDouble();
		
		System.out.println("2� Nota: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if (media <7) {
			System.out.println("Reprovado");
		}
		else {
			if (media == 10)
			System.out.println("Aprovado com distin��o");
			else {
				System.out.println("Aprovado");
			}
		}

	}

}
