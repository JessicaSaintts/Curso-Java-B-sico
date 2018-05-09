package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// Ler 3 números e mostrar em ordem decrescente
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1ª Numero: ");
		int n1 = scan.nextInt();
		
		System.out.println("2ª Numero: ");
		int n2 = scan.nextInt();
		
		System.out.println("3ª Numero: ");
		int n3 = scan.nextInt();
		
		if (n1 >= n2 && n1 >= n3){
			if(n2 >= n3) {
				System.out.println(n1 + ", " +n2 + ", " + n3);
			}else {
				System.out.println(n1 + ", " +n3 + ", " + n2);
			}	
		}
		else if (n2 >= n1 && n2 >= n3){
			if(n1 >= n3) {
				System.out.println(n2 + ", "  +n1 + ", "  + n3);
			}else {
				System.out.println(n2 + ", " +n3 + ", "  + n1);
			}
		}
		else if (n3 >= n1 && n3 >= n2){
			if(n1 >= n2) {
				System.out.println(n3 +", " +n1+ ", " + n2);
			}else {
				System.out.println(n3 +", " +n2 +", " + n1);
			}
		}

	}

}
