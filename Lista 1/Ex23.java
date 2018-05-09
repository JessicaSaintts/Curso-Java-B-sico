package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Filé duplo (F), Alcatra (A), Picanha(P): ");
		String tipoCarne = scan.next();
		
		System.out.println("Quantidade (kg): ");
		double qtdKg = scan.nextDouble();
		
		double precoCarne = 0;
		if (tipoCarne.equalsIgnoreCase("F")) {
			if (qtdKg <= 5) {
				precoCarne = 4.9;
			}else {
				precoCarne = 5.8;
			}
		}else if (tipoCarne.equalsIgnoreCase("A")) {
			if (qtdKg <= 5) {
				precoCarne = 5.9;
			}else {
				precoCarne = 6.8;
			}
		}else if (tipoCarne.equalsIgnoreCase("P")) {
			if (qtdKg <= 5) {
				precoCarne = 6.9;
			}else {
				precoCarne = 7.8;
			}
		}
		
		double totalCompra = qtdKg * precoCarne;
		
		System.out.println("Cartão Tabajara (S ou N)? ");
		String cartao = scan.next();
		
		double desconto = 0;
		if (cartao.equalsIgnoreCase("S")) {
			desconto = 5;
		}else {
			desconto = 0;
		}
		
		double porcentagemDesc = (totalCompra * desconto) / 100;
		System.out.println("Tipo carne: " + tipoCarne);
		System.out.println("Quantidade: " + qtdKg);
		System.out.println("Preço total: " + totalCompra);
		System.out.println("Cartão Tabajara? " + cartao);
		System.out.println("Valor do desconto: " + porcentagemDesc);
		System.out.println("Valor a pagar: " + (totalCompra - porcentagemDesc));

	}

}
