// Ler dois números e imprimir todos os números entre eles.
// Suponha que o segundo número é maior que o primeiro.

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioNove {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number1 = scanner.nextInt();

        System.out.print("Digite outro número (maior que o primeiro): ");
        int number2 = scanner.nextInt();

        while (number2 <= number1) {
            System.out.println(number2);
            number2--;
        }

        scanner.close();
    }
}
