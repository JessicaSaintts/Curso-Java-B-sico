package cursojava.aula17exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean senhaIgual = true;
		String usuario, senha;
		do {
			System.out.println("Usuário: ");
			usuario = scan.next();
		
			System.out.println("Senha: ");
			senha = scan.next();
		
			if(usuario.equalsIgnoreCase(senha)) {
				senhaIgual = true;
				System.out.println("Digite outra senha");
			}else {
				senhaIgual = false;
				System.out.println("Cadastro realizado");
			}
		}
		while(senhaIgual);

	}

}
