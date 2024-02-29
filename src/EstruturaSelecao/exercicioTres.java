// Escrever um programa para ler um número inteiro e informar se ele é divisível
//por 5.

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 5.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 5.");
        }

        scanner.close();
    }
}
