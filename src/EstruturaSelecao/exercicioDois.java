// Uma loja fornece 10% de desconto para funcionários e 5% de desconto para
//clientes vips. Faça um programa que calcule o valor total a ser pago por uma
//pessoa. O programa deverá ler o valor total da compra efetuada e um código que
//identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Digite o código do comprador:");
        System.out.println("1 - Cliente comum");
        System.out.println("2 - Funcionário");
        System.out.println("3 - Cliente VIP");
        System.out.print("Código: ");
        int codigoComprador = scanner.nextInt();

        double desconto = 0;
        switch (codigoComprador) {
            case 1:
                desconto = valorCompra * 0.05; // 5% de desconto para cliente comum
                break;
            case 2:
                desconto = valorCompra * 0.10; // 10% de desconto para funcionário
                break;
            case 3:
                desconto = valorCompra * 0.05; // 5% de desconto para cliente VIP
                break;
            default:
                System.out.println("Código inválido. Não foi aplicado nenhum desconto.");
        }

        double valorTotal = valorCompra - desconto;

        System.out.println("O valor total a ser pago é: R$ " + valorTotal);

        scanner.close();
    }
}
