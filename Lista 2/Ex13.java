package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, base, expoente;
		
		System.out.println("Número da base: ");
		base = scan.nextInt();
		
		System.out.println("Número do expoente: ");
		expoente = scan.nextInt();
		
		// 2^3 = 2*2*2 = 8
		int resultado = base;
		
		for(i = 1; i < expoente; i++) {
			resultado = resultado * base;
		}
		System.out.println("Resultado: " + resultado);
	}

}
