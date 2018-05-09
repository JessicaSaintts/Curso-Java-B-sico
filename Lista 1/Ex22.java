package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Morango (kg): ");
		double morango = scan.nextDouble();
		
		System.out.println("Maçã (kg): ");
		double maca = scan.nextDouble();
		
		double precoMorango = 0;
		if (morango <= 5) {
			precoMorango = 2.5;
		}else {
			precoMorango = 2.2;
		}
		
		double precoMaca = 0;
		if (maca <= 5) {
			precoMaca = 1.8;
		}else {
			precoMaca = 1.5;
		}
		
		double totalMorango = morango * precoMorango;
		double totalMaca = maca * precoMaca;
		double qtdTotal = morango + maca;
		double total = totalMorango + totalMaca;
		
		double desconto = 0;
		if (qtdTotal > 8 || total > 25) {
			desconto = (total /100) * 10;
			total = total - desconto;
			System.out.println("Total: " + total);
		}else {
			System.out.println("Total: " + total);
		}
		

	}

}
