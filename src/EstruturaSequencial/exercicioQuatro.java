// Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual,
//calcule e mostre:
//a) a idade atual dessa pessoa.
//b) quantos anos ela terá em 2018.

package EstruturaSequencial;

import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoNascimento;

        int idade2018 = 2018 - anoNascimento;

        System.out.println("A idade atual da pessoa é: " + idadeAtual + " anos.");
        System.out.println("Em 2018, a pessoa terá: " + idade2018 + " anos.");

        scanner.close();
    }
}
