// Ler um vetor A de 6 elementos contendo o gabarito da Mega Sena.
// A seguir, ler um vetor B de 10 elementos contendo uma aposta. Escrever quantos pontos fez
//o apostador, e se ele fez a sena (6 acertos), a quina (5 acertos) ou a quadra (4 acertos)

package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorMega = {25, 12, 40, 6, 53, 18};
        int[] vetorBet = new int[10];

        for (int i = 0; i < vetorBet.length; i++) {
            System.out.print("Digite o " + (i+1) + "ª número de sua aposta: ");
            vetorBet[i] = scanner.nextInt();
        }

        Arrays.sort(vetorMega);
        Arrays.sort(vetorBet);

        System.out.println("Você acerto os seguintes números:");
        for (int i = 0; i < Math.min(vetorMega.length, vetorBet.length); i++) {
            for (int j = 0; j < vetorBet.length; j++) {
                if (vetorMega[i] == vetorBet[j]) {
                    System.out.println(vetorMega[i]);
                    break;
                }
            }
        }

        scanner.close();
        
    }
}
