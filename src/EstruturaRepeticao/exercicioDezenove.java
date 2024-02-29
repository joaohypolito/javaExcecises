// Ler vários números e informar quantos números entre 100 e 200 foram digitados.
// Quando o valor 0 (zero) for lido, o algoritmo deverá cessar sua execução

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioDezenove {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int checked = 0;

        do {
            System.out.println("Digite um número entre 1 e 200 (Digite 0 para encerrar a execução):");
            number = scanner.nextInt();

            if (number >= 100 && number <= 200) {
                checked++;
            }

            System.out.println("Até o momento foram digitados " + checked + " números entre 100 e 200.\n");

        } while (number != 0);

        scanner.close();

    }
}
