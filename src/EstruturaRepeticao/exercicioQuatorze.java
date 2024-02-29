// Criar um algoritmo que imprima todos os números de 11 até 89 e a soma deles.

package EstruturaRepeticao;


public class exercicioQuatorze {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 11; i <= 89; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("A soma dos números de 11 até 89 é: " + sum);

    }
}
