/*
Uma empresa decidiu implementar um sistema de cálculo de gratificação mensal para seus colaboradores com base nas horas extras realizadas e nas horas de falta registradas durante o mês.

Para determinar o valor da gratificação, deve-se:

Ler o total de horas extras realizadas no mês.

Ler o total de horas-falta registradas no mês.

Calcular o valor de H, utilizando a seguinte fórmula:

H=horasExtras−(0,67×horasFaltas)

Converter o resultado de H para minutos:

minutos=H×60

De acordo com a quantidade de minutos obtida, determinar o valor da gratificação conforme a tabela abaixo:

| Minutos Calculados | Valor da Gratificação |
| ------------------ | --------------------- |
| Menor que 600      | R$ 100,00             |
| De 600 a 1200      | R$ 200,00             |
| De 1201 a 1800     | R$ 300,00             |
| De 1801 a 2400     | R$ 400,00             |
| Acima de 2400      | R$ 500,00             |

Desenvolva um programa em que leia as informações, realize os cálculos necessários e exiba na tela o valor correspondente da gratificação.

*/

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double horasExtras, horasFalta, h;
        int minutos;
        double gratificacao;

        System.out.print("Digite o total de horas extras: ");
        horasExtras = input.nextDouble();

        System.out.print("Digite o total de horas-falta: ");
        horasFalta = input.nextDouble();

        h = horasExtras - (0.67 * horasFalta);

        minutos = (int) (h * 60);

        if (minutos < 600) {
            gratificacao = 100.00;
        } else if (minutos <= 1200) {
            gratificacao = 200.00;
        } else if (minutos <= 1800) {
            gratificacao = 300.00;
        } else if (minutos <= 2400) {
            gratificacao = 400.00;
        } else {
            gratificacao = 500.00;
        }

        System.out.printf("\nTotal de minutos calculados: %d", minutos);
        System.out.printf("\nO valor da gratificação é: R$ %.2f\n", gratificacao);
		
		input.close();
	}
}