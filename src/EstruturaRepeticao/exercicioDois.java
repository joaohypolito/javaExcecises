// Fazer um programa para receber um número inteiro do usuário e determinar se
//este número é primo ou não. Primo é aquele divisível somente por ele mesmo e um.

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para descobri se ele é primo:");
        int number = scanner.nextInt();

        boolean isPrimeNumber = true;

        if (number <= 1) {
            isPrimeNumber = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if (isPrimeNumber) {
            System.out.println(number + " é primo.");
        } else {
            System.out.println(number + " não é primo.");
        }

        scanner.close();
    }
}
