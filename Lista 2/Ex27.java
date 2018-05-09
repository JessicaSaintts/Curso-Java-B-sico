package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a qtde de temperaturas: ");
		int qtdTemp = scan.nextInt();
		
		int soma = 0;
		double temp;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for(int i = 0; i < qtdTemp; i++) {
			
			System.out.println("Temperatura: ");
			temp = scan.nextDouble();
			
			soma += temp;
			
			if (temp > maior) {
				maior = temp;
			}
			if (temp < menor) {
				menor = temp;
			}
			
		}
		
		System.out.println("Média: " + soma/qtdTemp);
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);

	}

}
