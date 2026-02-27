// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		double valorDeposito, valorRendimento, taxaJuros = 0.007; 
        System.out.print("Digite o valor do depósito: ");
        valorDeposito = input.nextDouble();

        valorRendimento = valorDeposito + (valorDeposito * taxaJuros);

        System.out.printf("\nValor após um mês de rendimento: R$ %.2f\n", valorRendimento);		 

		input.close();
	}
}