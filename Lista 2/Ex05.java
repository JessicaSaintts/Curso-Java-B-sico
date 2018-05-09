package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		double popA, popB, taxaA, taxaB;
		
		do {
			System.out.println("População A: ");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			}else {
				System.out.println("População A precisa ser maior que 0");
			}
			
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("População B: ");
			popB = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			}else {
				System.out.println("População A precisa ser maior que 0");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Taxa crescimento A: ");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento A precisa ser maior que 0");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Taxa crescimento B: ");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento B precisa ser maior que 0");
			}
		}while(!valido);
		
		int cont = 0;
		
		while (popA < popB) {
			popA = popA + (popA/100) * taxaA;
			popB = popB + (popB/100) * taxaB;
			cont ++;
		}
		
		System.out.println("A: " + popA);
		System.out.println("B: " + popB);
		System.out.println("Anos: " + cont);

	}

}
