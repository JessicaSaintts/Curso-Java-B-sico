package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//System.out.println("Lojas Tabajara");

		boolean sair = false;
		String continuarCompra, output;
		int qtdProdutos;
		double preco, total, valorPago, troco;
		
		do {
			System.out.println("Nova compra? S/N");
			continuarCompra = scan.next();
			
			if(continuarCompra.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Quantidade de produtos: ");
				qtdProdutos = scan.nextInt();
				
				total = 0;
				
				for(int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Preço do produto: " + i);
					preco = scan.nextDouble();
					
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
					
					
				}
				
				output += "Total: R$ " + total + "\n";
				
				System.out.println("Total: R$ " + total);
				
				System.out.println("Valor pago: ");
				valorPago = scan.nextDouble();
				
				output += "Dinheiro: R$ " + valorPago + "\n";
				
				troco = total - valorPago;
				
				output += "Troco: R$ " + troco;
				
				System.out.println(output);
				
			}else {
				sair = true;
			}	
			
		} while (!sair);

	}

}
