// Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.

package EstruturaRepeticao;


import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10:");
        int number = scanner.nextInt();

        int multiplier = 1;

        if (number >= 1 && number <= 10) {
            while (multiplier <= 10) {
                System.out.println(number * multiplier);
                multiplier++;
            }
        } else {
            System.out.println("Número inválido.");
        }

        scanner.close();
    }
}
