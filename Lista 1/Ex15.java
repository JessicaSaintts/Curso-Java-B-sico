package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1ª lado: ");
		double l1 = scan.nextDouble();
		System.out.println("2ª lado: ");
		double l2 = scan.nextDouble();
		System.out.println("3ª lado: ");
		double l3 = scan.nextDouble();
		
		if (l1 + l2 >l3 || l2 + l3 > l1 || l1 + l3 > l2) {
			if (l1 == l2 && l1 == l3 && l2 == l3) {
				System.out.println("Equilátero");
			}else if(l1 == l2 || l1 == l3 || l2 == l3) {
				System.out.println("Isósceles");
			}else if (l1 != l2 || l1 != l3 || l2 != l3){
				System.out.println("Escaleno");
			}
		}else {
			System.out.println("Não é triângulo");
		}

	}

}
