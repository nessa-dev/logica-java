/* Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir. 
 * Para idade inferior a 5, deverá mostrar a mensagem "nenhuma".
 * Categorias: infantil (5 a 7 anos), juvenil (8 a 10), adolescente (11 a 15), adulto (16 a 30) ou sênior (acima de 30 anos). */

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int idade;

        System.out.print("Digite a idade do nadador: ");
        idade = input.nextInt();

        if (idade < 5) {
            System.out.println("Categoria: nenhuma");
        } else if (idade <= 7) {
            System.out.println("Categoria: infantil");
        } else if (idade <= 10) {
            System.out.println("Categoria: juvenil");
        } else if (idade <= 15) {
            System.out.println("Categoria: adolescente");
        } else if (idade <= 30) {
            System.out.println("Categoria: adulto");
        } else {
            System.out.println("Categoria: sênior");
        }

		input.close();
	}
}