/* Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
 * Triângulo Equilátero: possui os 3 lados iguais.
 * Triângulo Isósceles: possui 2 lados iguais.
 * Triângulo Escaleno: possui 3 lados diferentes. */

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double lado1, lado2, lado3;

        System.out.print("Digite a medida do primeiro lado: ");
        lado1 = input.nextDouble();

        System.out.print("Digite a medida do segundo lado: ");
        lado2 = input.nextDouble();

        System.out.print("Digite a medida do terceiro lado: ");
        lado3 = input.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é EQUILÁTERO.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é ISÓSCELES.");
        } else {
            System.out.println("O triângulo é ESCALENO.");
        }
		
		input.close();
	}
}