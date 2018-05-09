package cursojava.aula15exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor hora: ");
		double hora = scan.nextDouble();
		
		System.out.println("Quantidade horas/mês: ");
		double qtdHora = scan.nextDouble();
		
		double salarioBruto = hora * qtdHora;
		
		int ir = 0;
		if (salarioBruto <= 900) {
			ir = 0;
		}
		else if (salarioBruto <= 1500) {
			ir = 5;
		}
		else if (salarioBruto <= 2500) {
			ir = 10;
		}
		else {
			ir = 20;
		}
		
		double descontoIr= (salarioBruto * ir)/100;
		double inss = (salarioBruto * 10)/100;
		double fgts = (salarioBruto * 11)/100;
		double descontos = descontoIr + inss;
		double novoSalario = salarioBruto + fgts - descontos;
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("(-) IR (5%): " + descontoIr);
		System.out.println("(-) INSS (10%): " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de descontos: " + descontos);
		System.out.println("Salário líquido: " + novoSalario);

	}

}
