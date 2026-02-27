// Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int numero;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        if (numero % 3 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3.");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 3.");
        }
		
		input.close();
	}
}