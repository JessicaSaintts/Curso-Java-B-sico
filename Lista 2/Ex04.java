package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		double popA = 80000;
		double popB = 200000;
		int cont = 0;
		
		while (popA < popB) {
			popA = popA + (popA/100) * 3;
			popB = popB + (popB/100) * 1.5;
			cont ++;
		}
		
		System.out.println("A: " + popA);
		System.out.println("B: " + popB);
		System.out.println("Anos: " + cont);

	}

}