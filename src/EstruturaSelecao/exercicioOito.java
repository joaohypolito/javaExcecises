// O cardápio de uma lanchonete é o seguinte:
//        Especificação	Código	Preço
//        Cachorro quente 100     1,20
//        Bauru simples   101     1,30
//        Bauru com ovo   102     1,50
//        Hambúrguer      103     1,20
//        Cheeseburguer   104     1,30
//        Refrigerante    105     1,00
// Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule
//o valor a ser pago por aquele lanche. Considere que a cada execução somente
//será calculado um item.

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioOito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardapio = """
            CARDÁPIO DA LANCHONETE
        Item        	Código	Preço
        Cachorro quente 100     1,20
        Bauru simples   101     1,30
        Bauru com ovo   102     1,50
        Hambúrguer      103     1,20
        Cheeseburguer   104     1,30
        Refrigerante    105     1,00
        """ ;

        System.out.print(cardapio);
        System.out.println("Escolha um item do cardápio acima através de seu código:");
        int option = scanner.nextInt();

        switch (option) {
            case 100:
                double priceHotDog = 1.20;
                System.out.println("O valor da sua conta é: R$" + priceHotDog);
            case 101:
                double priceBauruS = 1.30;
                System.out.println("O valor da sua conta é: R$" + priceBauruS);
            case 102:
                double priceBauruE = 1.50;
                System.out.println("O valor da sua conta é: R$" + priceBauruE);
            case 103:
                double priceHamburger = 1.20;
                System.out.println("O valor da sua conta é: R$" + priceHamburger);
            case 104:
                double priceCheeseburger = 1.30;
                System.out.println("O valor da sua conta é: R$" + priceCheeseburger);
            case 105:
                double priceSoda = 1.00;
                System.out.println("O valor da sua conta é: R$" + priceSoda);
            default:
                System.out.println("Código inválido.");
        }

        scanner.close();
    }
}
