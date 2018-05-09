package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Litros: ");
		double litros = scan.nextDouble();
		
		System.out.println("Alcool ou Gasolina (A ou G)? ");
		String combustivel = scan.next();
		
		double alcool = 1.9;
		double gasolina = 2.5;
		double desconto = 0;
		double preco = 0;
		double totalDesc = 0;
		
		if (combustivel.equalsIgnoreCase("A")) {
			if(litros <=20) {
				desconto = 0.03;
			}else {
				desconto = 0.05;
			}
			preco = alcool * litros;
		}
		else if (combustivel.equalsIgnoreCase("G")) {
			if(litros <=20) {
				desconto = 0.04;
			}else {
				desconto = 0.06;	
			}
			preco = gasolina * litros;
		}
		
		totalDesc = preco * desconto;
		System.out.println("Preço: " + preco);
		System.out.println("Desconto: " + totalDesc);
		System.out.println("Total: " + (preco - totalDesc));
		

	}

}
