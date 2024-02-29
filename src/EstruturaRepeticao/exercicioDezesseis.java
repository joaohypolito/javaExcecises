// Ler 10 números e imprimir quantos são pares e quantos são ímpares.

package EstruturaRepeticao;

public class exercicioDezesseis {

    public static void main(String[] args) {

        int sumPair = 0;
        int sumOdd = 0;

        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                sumPair++;
            } else {
                sumOdd++;
            }
        }

        System.out.println("A quantidade de números pares é: " + sumPair);
        System.out.println("A quantidade de números pares é: " + sumOdd);

    }
}
