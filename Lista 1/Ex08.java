package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� pre�o: ");
		double n1 = scan.nextDouble();
		
		System.out.println("2� pre�o: ");
		double n2 = scan.nextDouble();
		
		System.out.println("3� pre�o: ");
		double n3 = scan.nextDouble();
		
		if (n1 <= n2 && n1 <= n3){
			System.out.println(n1 + " � mais barato");
		}else if (n2 <= n1 && n2 <= n3){
			System.out.println(n2 + " � mais barato");
		}else{
			System.out.println(n3 + " � mais barato");
		}

	}

}
