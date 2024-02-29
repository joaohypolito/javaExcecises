// Entrar com um número inteiro positivo e exibir o fatorial deste número, lembrando que 0! = 1. Exemplo: 5! = 5x4x3x2x1 = 120

package EstruturaRepeticao;

import com.sun.jdi.Value;

import java.util.Scanner;

public class exercicioVinteUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int factorial = 1;

        do {
            System.out.println("Digite um número inteiro para ver seu fatorial:");
            number = scanner.nextInt();

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println(number + "! = " + factorial);

        } while (number != 0);

    }
}
