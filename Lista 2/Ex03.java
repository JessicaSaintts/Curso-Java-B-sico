package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Nome: ");
			nome = scan.next();
			
			if (nome.length() > 3) {
				infoValida = true;
			}else {
				System.out.println("Digite nome com mais de 3 caracteres");
			}
		}while(!infoValida);
		
		
		infoValida = false;
		do {
			System.out.println("Idade: ");
			idade = scan.nextInt();
			
			if (idade >=0 && idade <= 150) {
				infoValida = true;
			}else {
				System.out.println("Digite idade entre 0 e 150");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Salario: ");
			salario = scan.nextDouble();
			
			if (salario >=0) {
				infoValida = true;
			}else {
				System.out.println("Salário deve ser maior que 0");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Sexo (F ou M): ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			}else {
				System.out.println("Sexo deve ser F ou M");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Estado civil (S, C, V ou D): ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			}else {
				System.out.println("Estado civil deve ser S, C, V ou D");
			}
			
		}while(!infoValida);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);

	}

}
