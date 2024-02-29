// Preencher um vetor com 10 valores reais e exibir todos os valores acima de 100

package Vetores;

import java.util.Scanner;

public class exercicioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Valores acima de 100:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 100) {
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
        
    }

}
