// Faça um programa que o usuário informe o salário recebido e o total gasto.
//Deverá ser exibido na tela “Gastos dentro do orçamento” caso o valor gasto não
//ultrapasse o valor do salário e “Orçamento estourado” se o valor gasto
//ultrapassar o valor do salário.

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Informe seu gasto mensal: ");
        double gasto = scanner.nextDouble();

        if (salario < gasto) {
            System.out.println("Orçamento estourado!");
        } else {
            System.out.println("Gastos dentro do orçamento.");
        }

        scanner.close();
    }
}
