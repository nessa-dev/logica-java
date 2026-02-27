/* Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. 
 * Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. 
 * O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos. */

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		double salarioCarlos, salarioJoao;
        int meses = 0;

        System.out.print("Digite o salário do Carlos: ");
        salarioCarlos = input.nextDouble();

        salarioJoao = salarioCarlos / 3;

        while (salarioJoao < salarioCarlos) {
            salarioCarlos += salarioCarlos * 0.02; // Poupança rende 2%
            salarioJoao += salarioJoao * 0.05;     // Renda fixa rende 5%
            meses++;
        }

        System.out.println("\nSerão necessários " + meses + " meses.");
        System.out.printf("Valor final de Carlos: R$ %.2f\n", salarioCarlos);
        System.out.printf("Valor final de João: R$ %.2f\n", salarioJoao);
		
		input.close();
	}
}