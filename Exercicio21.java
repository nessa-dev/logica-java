/* Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. 
 * Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida e  ACESSO NEGADO caso a senha seja inválida. */

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int senha;
        int senhaCorreta = 1234;

        System.out.print("Digite a senha: ");
        senha = input.nextInt();

        if (senha == senhaCorreta) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
		
		input.close();
	}
}