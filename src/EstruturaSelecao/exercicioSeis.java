// Faça o algoritmo que leia o valor de uma conta de luz (CL) e, caso o valor seja
//maior que R$ 150,00, apresente a mensagem: “Você está gastando muito”. Caso
//contrário exiba a mensagem: “Seu gasto foi normal”.

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioSeis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da conta de luz do mês: ");
        double contaLuz = scanner.nextDouble();

        if (contaLuz > 150.0) {
            System.out.println("Você está gastando muito!");
        } else {
            System.out.println("Seu gasto foi normal.");
        }

        scanner.close();
    }
}
