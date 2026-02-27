/* Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
 * Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numLados;
        double medidaLado, area;

        System.out.print("Digite o número de lados do polígono: ");
        numLados = input.nextInt();

        if (numLados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (numLados == 3) {
            System.out.print("Digite a medida do lado (cm): ");
            medidaLado = input.nextDouble();
            area = (Math.pow(medidaLado, 2) * Math.sqrt(3)) / 4;
            System.out.printf("TRIÂNGULO - Área: %.2f cm²\n", area);
        } else if (numLados == 4) {
            System.out.print("Digite a medida do lado (cm): ");
            medidaLado = input.nextDouble();
            area = Math.pow(medidaLado, 2);
            System.out.printf("QUADRADO - Área: %.2f cm²\n", area);
        } else if (numLados == 5) {
            System.out.println("PENTÁGONO");
        } else {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }
		
		input.close();
	}
}