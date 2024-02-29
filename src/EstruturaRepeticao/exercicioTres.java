// Fazer um programa para encontrar todos os pares entre 1 e 100.

package EstruturaRepeticao;


public class exercicioTres {

    public static void main(String[] args) {

        int i = 100;

        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }

    }
}
