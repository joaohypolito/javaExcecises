// Leia nome, salário e categoria de um funcionário, se a categoria for igual a “m”
//de mensalista, conceder 10% de aumento, se for igual a “h” de horista, conceder
//20% de aumento, se não for “m” nem “h”, exibir a mensagem categoria inválida

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioDez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe seu nome:");
        String name = scanner.nextLine();

        System.out.println("Informe seu salário:");
        double salary = scanner.nextDouble();

        System.out.println("Informe sua categoria (M - Mensalista; H - Horista)");
        char category = scanner.next().toLowerCase().charAt(0);

        if (category == 'M') {
            System.out.println("Seu aumento será de 10%");
            double newSalaryM = salary + (salary * 0.1);
            System.out.println("Seu salário atualiza é de R$ " + newSalaryM);
        } else if (category == 'h') {
            System.out.println("Seu aumento será de 10%");
            double newSalaryH = salary + (salary * 0.2);
            System.out.println("Seu salário atualiza é de R$ " + newSalaryH);
        } else {
            System.out.println("Categoria inválida.");
        }

        scanner.close();
    }
}
