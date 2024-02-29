// Entrar com 15 números e imprimir quantos números maiores que 30 foram digitados.

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioDezessete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int numbersTyped = 0;

        while (i <= 15) {
            int number = 0;

            System.out.println("Digite um número: ");
            number = scanner.nextInt();

            if(number >= 30) {
                numbersTyped++;
            }

            i++;
        }

        System.out.println("Foram digitados " + numbersTyped + " maiores que 30.");

        scanner.close();
    }
}
