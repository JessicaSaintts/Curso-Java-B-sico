package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1ª nota: ");
		double n1 = scan.nextDouble();
		
		System.out.println("2ª nota: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		String aproveitamento = "";
		
		if (media >=9 && media<=10) {
			aproveitamento = "A";
		}else if (media >=7.5 && media<9) {
			aproveitamento = "B";
		}else if (media >=6 && media<7.5) {
			aproveitamento = "C";
		}else if (media >=4 && media<6) {
			aproveitamento = "D";
		}else {
			aproveitamento = "E";
		}
		
		switch (aproveitamento) {
		case "A":
		case "B":
		case "C": System.out.println("Media: " + media + "\nAprovado"); break;
		case "D":
		case "E": System.out.println("Media: " + media + "\nReprovado"); break;
		}
	}

}
