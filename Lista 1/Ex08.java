package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1ª preço: ");
		double n1 = scan.nextDouble();
		
		System.out.println("2ª preço: ");
		double n2 = scan.nextDouble();
		
		System.out.println("3ª preço: ");
		double n3 = scan.nextDouble();
		
		if (n1 <= n2 && n1 <= n3){
			System.out.println(n1 + " é mais barato");
		}else if (n2 <= n1 && n2 <= n3){
			System.out.println(n2 + " é mais barato");
		}else{
			System.out.println(n3 + " é mais barato");
		}

	}

}
