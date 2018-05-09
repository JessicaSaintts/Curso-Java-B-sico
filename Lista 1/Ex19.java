package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� N�mero: ");
		double n1 = scan.nextDouble();
		
		System.out.println("2� N�mero: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Opera��o (+, -, *, /): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true; //flag
		switch (operacao) {
		case "+": resultado = n1+n2; break;
		case "-": resultado = n1-n2; break;
		case "*": resultado = n1*n2; break;
		case "/": resultado = n1/n2; break;
		default: System.out.println("Opera��o inv�lida"); valida = false;
		}
		
		if (valida) {
			System.out.println("Resultado: " + resultado);
			if (resultado % 2 == 0) {
				System.out.println("N�mero par");
			}else {
				System.out.println("N�mero �mpar");
			}
			if (resultado < 0) {
				System.out.println("N�mero negativo");
			}else {
				System.out.println("N�mero positivo");
			}
		}
		
		
		/*double resultado = 0;
		switch (operacao) {
		case "+": resultado = n1+n2; break;
		case "-": resultado = n1-n2; break;
		case "*": resultado = n1*n2; break;
		case "/": resultado = n1/n2; break;
		default: System.out.println("Opera��o inv�lida");break;
		}
		
		System.out.println("Resultado: " + resultado);
		if (resultado % 2 == 0) {
			System.out.println("N�mero par");
		}else {
			System.out.println("N�mero �mpar");
		}
		if (resultado < 0) {
			System.out.println("N�mero negativo");
		}else {
			System.out.println("N�mero positivo");
		}*/
	}

}
