/* Faça um programa que receba a idade e o peso de uma pessoa. 
 * De acordo com a tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se encaixa.
 * Menores que 20 anos - risco 9 até 60 kg, risco 8 entre 60 e 90 kg, risco 7 acima de 90 kg.
 * De 20 a 50 anos - risco 6 até 60 kg, risco 5 entre 60 e 90 kg, risco 4 acima de 90 kg.
 * Maiores que 50 anos - risco 3 até 60 kg, risco 2 entre 60 e 90 kg, risco 1 acima de 90 kg. */

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int idade, risco = 0;
        double peso;

        System.out.print("Digite a idade: ");
        idade = input.nextInt();

        System.out.print("Digite o peso (kg): ");
        peso = input.nextDouble();

        if (idade < 20) {
            if (peso <= 60) risco = 9;
            else if (peso <= 90) risco = 8;
            else risco = 7;
        } 
        else if (idade <= 50) {
            if (peso <= 60) risco = 6;
            else if (peso <= 90) risco = 5;
            else risco = 4;
        } 
        else {
            if (peso <= 60) risco = 3;
            else if (peso <= 90) risco = 2;
            else risco = 1;
        }

        System.out.println("\nGrupo de Risco: " + risco);
		
		input.close();
	}
}