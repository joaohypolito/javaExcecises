// Criar um algoritmo que imprima a soma dos números pares entre 25 e 200.

package EstruturaRepeticao;

public class exercicioQuinze {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 25; i <= 200; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("A soma dos números de 25 até 100 é: " + sum);

    }
}
