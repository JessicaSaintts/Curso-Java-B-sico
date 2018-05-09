package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabuada do n�mero: ");
		int n = scan.nextInt();
		
		boolean invalido = true;
		int inicio, fim;
		int multiplica = 0;
		
		do {
			System.out.println("In�cio da tabuada: ");
			inicio = scan.nextInt();
		
			System.out.println("Final da tabuada: ");
			fim = scan.nextInt();
			
			if(fim > inicio) {
				invalido = false;
			}	
			
		}while(invalido);
		
		System.out.println("Tabuada de " + n);
		System.out.println("Come�ar por: " + inicio);
		System.out.println("Terminar por: " + fim);
		
		for (int i = inicio; i <= fim; i++) {
			multiplica = n * i;
			System.out.println(n + " x " + i + " = " + multiplica);
		}
		
		scan.close(); 
	}
}
