/* As maçãs custam R$ 0,30 cada se forem compradas menos de uma dúzia e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. */


import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int quantidade;
        double valorTotal;

        System.out.print("Digite a quantidade de maçãs compradas: ");
        quantidade = input.nextInt();

        if (quantidade < 12) {
            valorTotal = quantidade * 0.30;
        } else {
            valorTotal = quantidade * 0.25;
        }

        System.out.printf("O valor total da compra é: R$ %.2f\n", valorTotal); 

		input.close();
	}
}