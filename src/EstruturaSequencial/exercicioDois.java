// Ler uma medida em polegadas e imprimir a equivalente em centímetros,
//sabendo que 2.54 cm equivale a 1 polegada.

package EstruturaSequencial;

import java.util.Scanner;

public class exercicioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em polegadas: ");
        double polegadas = scanner.nextDouble();

        double centimetros = polegadas * 2.54;

        System.out.println(polegadas + " polegadas equivalem a " + centimetros + " centímetros.");

        scanner.close();
    }

}
