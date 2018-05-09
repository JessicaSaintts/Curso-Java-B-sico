package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de pessoas: ");
		int pessoas = scan.nextInt();
		
		int idade = 0;
		int soma = 0;
		
		for(int i = 0; i < pessoas; i++) {
			System.out.println("Digite a idade " + (i + 1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		
		double media = soma/pessoas;
		System.out.println("Media de idade: " + media);
		
		if(media > 0 && media <= 25) {
			System.out.println("Turma jovem");
		}else if (media > 26 && media <= 60) {
			System.out.println("Turma adulta");
		}else {
				System.out.println("Turma idosa");
		}

	}

}
