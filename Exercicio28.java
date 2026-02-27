/* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
* Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
* Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
* Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double angulo1, angulo2, angulo3;

        System.out.print("Digite o primeiro ângulo: ");
        angulo1 = input.nextDouble();

        System.out.print("Digite o segundo ângulo: ");
        angulo2 = input.nextDouble();

        System.out.print("Digite o terceiro ângulo: ");
        angulo3 = input.nextDouble();

        if ((angulo1 + angulo2 + angulo3) != 180) {
            System.out.println("Erro: A soma dos ângulos deve ser exatamente 180 graus.");
        } else {
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                System.out.println("O triângulo é RETÂNGULO.");
            } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                System.out.println("O triângulo é OBTUSÂNGULO.");
            } else {
                System.out.println("O triângulo é ACUTÂNGULO.");
            }
        }
		
		input.close();
	}
}