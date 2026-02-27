// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double cotacaoDolar, qtdDolar, valorReal;

        System.out.print("Informe a cotação do dólar hoje: ");
        cotacaoDolar = input.nextDouble();

        System.out.print("Informe a quantidade de dólares (US$): ");
        qtdDolar = input.nextDouble();

        valorReal = qtdDolar * cotacaoDolar;

        System.out.printf("\nO valor convertido em reais é: R$ %.2f\n", valorReal);

		 input.close();
	}
}
