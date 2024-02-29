// Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: “Múltiplo de 10”.

package EstruturaRepeticao;

public class exercicioCinco {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            if (i % 10 == 0) {
                System.out.println("Múltiplo de 10: " + i);
            }
            i++;
        }
        
    }
}
