// Leia 5 idades e calcule a média entre as idades (usar uma variável para idade)

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioDez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idades = 0;
        int i = 1;

        do {
            System.out.println("Digite a idade do " + i + "º participante:");
            idades += scanner.nextInt();
            i++;
        } while (i <= 5);

        double mediaIdades = (double) idades / i;

        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}
