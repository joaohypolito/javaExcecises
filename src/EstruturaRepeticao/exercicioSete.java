// Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos (incluindo os valores lidos na soma).
// Considere que o segundo valor lido será sempre maior que o primeiro valor lido.

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioSete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int number1 = scanner.nextInt();

        System.out.println("Digite outro número:");
        int number2 = scanner.nextInt();

        int sum = 0;

        if (number2 > number1) {
            for (int i = number1; i <= number2; i++) {
                sum += i;
            }
            System.out.println("A soma dos inteiros existentes entre os dois valores é: " + sum);
        } else {
            System.out.println("O segundo número precisa ser maior que o primeiro.");
        }

        scanner.close();
    }
}
