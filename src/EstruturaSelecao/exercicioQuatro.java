// Escrever um programa para ler um número inteiro e informar se ele é divisível
//por 5.

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        double maxPrestacao = salarioBruto * 0.30;

        if (valorPrestacao <= maxPrestacao) {
            System.out.println("O empréstimo pode ser concedido.");
        } else {
            System.out.println("O empréstimo não pode ser concedido.");
        }

        scanner.close();
    }
}
