/* Escreva um programa para ler a altura, peso e gênero para calcular o IMC.
*/

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int genero;
		double altura, pesoIdeal = 0;
		
		System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
		genero = input.nextInt();
		
		System.out.print("Digite a altura: ");
		altura = input.nextDouble();
		
		double imc, peso;

        System.out.print("Digite o seu peso (kg): ");
        peso = input.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.printf("\nSeu IMC é: %.2f", imc);

        if (imc < 18.5) {
            System.out.println("\nClassificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("\nClassificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("\nClassificação: Sobrepeso");
        } else {
            System.out.println("\nClassificação: Obesidade");
        }

        if (genero == 2) { 
            pesoIdeal = 50 + 2.3 * ((altura * 100 / 2.54) - 60);
        } else if (genero == 1) { 
            pesoIdeal = 45.5 + 2.3 * ((altura * 100 / 2.54) - 60);
        }

        if (pesoIdeal > 0) {
            System.out.printf("Seu peso ideal estimado é: %.2f kg\n", pesoIdeal);
        }
		
		input.close();
	}
}