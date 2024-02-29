// Criar um algoritmo que imprima os números pares no intervalo de 1 a 600

package EstruturaRepeticao;


public class exercicioTreze {

    public static void main(String[] args) {

        for (int i = 1; i <= 600; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
