/* Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
 * Finalize a entrada de dados com um valor negativo ou zero. */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		double quadrado, cubo, raiz;
		
		System.out.print("Digite um número maior do que 0: ");
		num = input.nextInt();
		
		quadrado = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		raiz = Math.sqrt(num);
		
		while (num > 0) {
            quadrado = Math.pow(num, 2);
            cubo = Math.pow(num, 3);
            raiz = Math.sqrt(num);

            System.out.printf("\nNúmero: %d", num);
            System.out.printf("\nQuadrado: %.2f", quadrado);
            System.out.printf("\nCubo: %.2f", cubo);
            System.out.printf("\nRaiz Quadrada: %.2f\n", raiz);

            System.out.print("\nDigite o próximo número (0 ou negativo para sair): ");
            num = input.nextInt();
        }

        System.out.println("Programa finalizado.");
			
		input.close();
	}
}