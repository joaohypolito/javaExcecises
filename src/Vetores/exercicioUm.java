// Criar um vetor com 5 posições de inteiros e exibir o produto de todos valores

package Vetores;

public class exercicioUm {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + sum);

    }

}
