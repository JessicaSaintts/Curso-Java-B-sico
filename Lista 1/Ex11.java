package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Salário: ");
		double salario = scan.nextDouble();
		
		double porcentagem = 0;
		if (salario < 280) {
			porcentagem = 0.2;
		}
		else if (salario >= 280 && salario<700) {
			porcentagem = 0.15;
		}
		else if (salario >= 700 && salario<1500) {
			porcentagem = 0.1;
		}
		else {
			porcentagem = 0.05;
		}
		
		double aumento = salario * porcentagem;
		System.out.println("Salário: " + salario);
		System.out.println("Porcentagem: " + porcentagem);
		System.out.println("Aumento: " + aumento);
		System.out.println("Novo salário: " + (salario + aumento));

	}

}
