// Ler um vetor que contenha as notas de uma turma de 10 alunos.
// Calcular a média da turma e contar quantos alunos obtiveram nota acima desta média calculada.
// Escrever a média da turma e o resultado da contagem

package Vetores;

import java.util.Scanner;

public class exercicioTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];
        int aboveAvarege = 0;
        double avarege = 0;
        int sum = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a nota do " + (i+1) + "ª aluno: ");
            vetor[i] = scanner.nextDouble();
            sum += vetor[i];
        }

        avarege = (double) sum / vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > avarege) {
                aboveAvarege++;
            }
        }

        System.out.println("Média das notas: " + avarege);
        System.out.println("Quantidade de alunos acima da média: " + aboveAvarege);

        scanner.close();
        
    }
}
