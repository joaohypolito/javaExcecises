// Ler dois números e imprimir todos os números ímpares entre eles.
// Suponha que o segundo é maior que o primeiro.

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioOnze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number1 = scanner.nextInt();

        System.out.print("Digite outro número (maior que o primeiro): ");
        int number2 = scanner.nextInt();

        for (int i = number1; i <= number2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
