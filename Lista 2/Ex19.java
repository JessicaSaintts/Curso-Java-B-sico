package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de notas: ");
		int notas = scan.nextInt();
		
		double nota, media, soma = 0;
		
		for(int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota: ");
			nota = scan.nextInt();
			
			soma += nota;
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma/notas);

	}

}
