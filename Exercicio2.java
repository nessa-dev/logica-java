//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

import  java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double consumoMedio;
        double kmi; 
        double kmf; 
        double litros;
        double kmtotal;

        System.out.print("Informe a distancia inicial: ");
        kmi = input.nextDouble();
        
        System.out.print("Informe a distancia final: ");
        kmf = input.nextDouble();
        
        System.out.print("Informe o total de litros consumidos: ");
        litros = input.nextDouble();

        kmtotal = kmf - kmi;
        
        if (litros > 0) {
            consumoMedio = kmtotal / litros;
            System.out.printf("\nDistancia percorrida: %.2f km", kmtotal);
            System.out.printf("\nConsumo Medio: %.2f km/l\n", consumoMedio);
        } else {
            System.out.println("\nErro: O total de litros deve ser maior que zero.");
        }

        input.close();
	}
}
