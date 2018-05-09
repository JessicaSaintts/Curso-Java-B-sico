package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Nota (0 - 10): ");
			double nota = scan.nextDouble();
			
			if (nota >=0 && nota <=10) {
				notaValida = true;
				System.out.println("Nota: " + nota);
			}else {

				System.out.println("Nota inválida, digite novamente");
			}
		}
		while(!notaValida);

	}

}
