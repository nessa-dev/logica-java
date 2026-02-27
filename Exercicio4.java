// Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double n1, n2, n3, media;
		String nome;

		System.out.print("Informe seu nome:");
		nome = input.nextLine();
		System.out.print("Informe sua primeira nota:");
		n1 = input.nextDouble();
		System.out.print("Informe sua segunda nota:");
		n2 = input.nextDouble();
		System.out.print("Informe sua terceira nota:");
		n3 = input.nextDouble();

		media = (n1 + n2 + n3) / 3;
		System.out.printf("Aluno: " + nome);
		System.out.printf("Sua média foi: %.2f/n", media);

		input.close();
	}
}
