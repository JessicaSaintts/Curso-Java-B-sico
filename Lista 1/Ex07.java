package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� Numero: ");
		int n1 = scan.nextInt();
		
		System.out.println("2� Numero: ");
		int n2 = scan.nextInt();
		
		System.out.println("3� Numero: ");
		int n3 = scan.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {	
			System.out.println("Maior numero: " + n1);
			if (n2<= n3) {
				System.out.println("Menor numero: " + n2);
			}
			else {
				System.out.println("Menor numero: " + n3);
			}
		}
		
		else if (n2 >= n1 && n2 >=n3){
			System.out.println("Maior numero: " + n2);
			if (n1<= n3) {
				System.out.println("Menor numero: " + n1);
			}
			else {
				System.out.println("Menor numero: " + n3);
			}
		}
		
		else {
			System.out.println("Maior numero: " + n3);
			if (n1<= n2) {
				System.out.println("Menor numero: " + n1);
			}
			else {
				System.out.println("Menor numero: " + n2);
			}
		}
		
		/*
		 * if (n1 >= n2 && n1 >= n3){
			System.out.println(n1 + " � maior");
		}else if (n2 >= n1 && n2 >= n3){
			System.out.println(n2 + " � maior");
		}else{
			System.out.println(n3 + " � maior");
		}
		
		if (n1 <= n2 && n1 <= n3){
			System.out.println(n1 + " � menor");
		}else if (n2 <= n1 && n2 <= n3){
			System.out.println(n2 + " � menor");
		}else{
			System.out.println(n3 + " � menor");
		}
		 */

	}

}
