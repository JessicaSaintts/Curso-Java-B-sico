package cursojava.aula15exercicios;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
		// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("F ou M: ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		}else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo inválido");
		}

	}

}
