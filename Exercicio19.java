// Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		short a, b;
		
		System.out.print("Digite o primeiro valor: ");
        a = input.nextShort();

        System.out.print("Digite o segundo valor: ");
        b = input.nextShort();

        if (a > b) {
            System.out.println("O maior valor é: " + a);
        } else {
            System.out.println("O maior valor é: " + b);
        }
		
		input.close();
	}
}