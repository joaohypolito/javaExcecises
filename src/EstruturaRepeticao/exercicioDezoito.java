// Entrar com 20 números e imprimir a soma dos positivos e o total de números negativos

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioDezoito {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int positiveSum = 0;
        int negativeTotal = 0;

        while (i <= 20) {
            System.out.println("Digite um número: ");
            int number = scanner.nextInt();

            if(number > 0) {
                positiveSum += number;
            } else {
                negativeTotal++;
            }

            i++;
        }

        System.out.println("A soma dos números positivos digitados é: " + positiveSum);
        System.out.println("Foram digitados " + negativeTotal + " números negativos.");

    }
}
