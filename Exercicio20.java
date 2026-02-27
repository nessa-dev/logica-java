/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
 * (não é necessário considerar o mês em que ela nasceu). */

import java.util.Scanner;

 public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int anoNascimento, idade;
        int anoAtual = 2026;

        System.out.print("Digite o seu ano de nascimento: ");
        anoNascimento = input.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Com " + idade + " anos, você já pode votar!");
        } else {
            System.out.println("Com " + idade + " anos, você ainda não pode votar.");
        }
		
		input.close();
	}
}