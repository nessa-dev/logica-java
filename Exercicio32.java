// Crie uma função recursiva que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N.

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else {
            int resultado = somatorio(n);
            System.out.println("O somatório de 1 até " + n + " é: " + resultado);
        }

        input.close();
    }

    public static int somatorio(int n) {
        if (n == 0) {
            return 0;
        }
        return n + somatorio(n - 1);
    }
}