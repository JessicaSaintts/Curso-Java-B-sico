package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1º Número: ");
		double n1 = scan.nextDouble();
		
		System.out.println("2º Número: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Operação (+, -, *, /): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true; //flag
		switch (operacao) {
		case "+": resultado = n1+n2; break;
		case "-": resultado = n1-n2; break;
		case "*": resultado = n1*n2; break;
		case "/": resultado = n1/n2; break;
		default: System.out.println("Operação inválida"); valida = false;
		}
		
		if (valida) {
			System.out.println("Resultado: " + resultado);
			if (resultado % 2 == 0) {
				System.out.println("Número par");
			}else {
				System.out.println("Número ímpar");
			}
			if (resultado < 0) {
				System.out.println("Número negativo");
			}else {
				System.out.println("Número positivo");
			}
		}
		
		
		/*double resultado = 0;
		switch (operacao) {
		case "+": resultado = n1+n2; break;
		case "-": resultado = n1-n2; break;
		case "*": resultado = n1*n2; break;
		case "/": resultado = n1/n2; break;
		default: System.out.println("Operação inválida");break;
		}
		
		System.out.println("Resultado: " + resultado);
		if (resultado % 2 == 0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número ímpar");
		}
		if (resultado < 0) {
			System.out.println("Número negativo");
		}else {
			System.out.println("Número positivo");
		}*/
	}

}
