// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.


import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor1, valor2, valor3, maior;

        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valor3 = input.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }

        System.out.println("O maior valor informado é: " + maior);
		
		input.close();

	}
}