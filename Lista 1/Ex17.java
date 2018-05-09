package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ano: ");
		double ano = scan.nextDouble();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
			System.out.println("Ano bissexto");
		}else {
			System.out.println("Não é bissexto");
		}

	}

}
