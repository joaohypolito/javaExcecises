// Faça um algoritmo que receba o salário-base de um funcionário, calcule e
//mostre o salário a receber, sabendo-se que esse funcionário tem gratificação de
//5% sobre o salário-base e paga imposto de 7% sobre o total.

package EstruturaSequencial;

import java.util.Scanner;

public class exercicioTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário-base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = salarioBase * 0.05;

        double salarioBruto = salarioBase + gratificacao;

        double imposto = salarioBruto * 0.07;

        double salarioReceber = salarioBruto - imposto;

        System.out.println("O salário a receber é: R$ " + salarioReceber);

        scanner.close();
    }
}
