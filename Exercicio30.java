// Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            long resultado = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é: " + resultado);
        }

        input.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}