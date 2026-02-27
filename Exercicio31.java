// Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Quantos números da sequência de Fibonacci você deseja ver? ");
        int n = input.nextInt();

        long proximo, atual = 1, anterior = 0;

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        for (int i = 1; i <= n; i++) {
            System.out.print(anterior + " ");

            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println();
		
		input.close();
	}
}