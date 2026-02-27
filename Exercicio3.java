// Escreva um programa que entre com um número e o imprima caso seja maior do que 20. 

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num; 
		System.out.print("Informe um número: ");
        num = input.nextInt();


		if (num > 20){
		System.out.println("O número informado foi: " + num);
		} else{
			System.out.print("Não é possível imprimir um número menor que 20");
		}
		input.close();
	}
}