package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, n, multiplica = 0;
		
		System.out.println("Tabuada do número: ");
		n = scan.nextInt();
		
		System.out.println("Tabuada de " + n);
		
		for (i = 0; i <= 10; i++) {
			multiplica = n * i;
			System.out.println(n + " x " + i + " = " + multiplica);
		}
		
		
		

	}

}
