/*
Uma empresa concederá um aumento de salário aos seus funcionários, variável
de acordo com o cargo, conforme a tabela abaixo.

Faça um algoritmo que leia o salário e o cargo de um funcionário (pelo código) e calcule o novo salário.

Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de
aumento. Mostre o salário antigo, o novo salário e a diferença.

Código  Cargo       Percentual
101     Gerente     10%
102     Engenheiro  20%
103     Técnico     30%
*/

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioNove {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        double salary = scanner.nextDouble();

        System.out.print("Informe o código do seu cargo (101 - Gerente; 102 - Engenheiro; 103 - Técnico): ");
        System.out.println("Caso seu cargo não possua código específo, informe qualquer número");
        int role = scanner.nextInt();

        switch (role) {
            case 101:
                System.out.println("Seu salário atual é: R$ " + salary);
                System.out.println("Seu aumento será de 10%");
                double newSalaryManager = salary + (salary * 0.1);
                System.out.println("Seu novo salário é: R$ " + newSalaryManager);
            case 102:
                System.out.println("Seu salário atual é: R$ " + salary);
                System.out.println("Seu aumento será de 20%");
                double newSalaryEngenieer = salary + (salary * 0.2);
                System.out.println("Seu novo salário é: R$ " + newSalaryEngenieer);
            case 103:
                System.out.println("Seu salário atual é: R$ " + salary);
                System.out.println("Seu aumento será de 20%");
                double newSalaryTechnician = salary + (salary * 0.3);
                System.out.println("Seu novo salário é: R$ " + newSalaryTechnician);
            default:
                System.out.println("Seu salário atual é: R$ " + salary);
                System.out.println("Seu aumento será de 20%");
                double newSalaryOther = salary + (salary * 0.4);
                System.out.println("Seu novo salário é: R$ " + newSalaryOther);
        }

        scanner.close();
    }
}
