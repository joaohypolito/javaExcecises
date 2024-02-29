// Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade, sexo (M/F) e salário.
// Faça um algoritmo que informe:
//      a) a média de salário do grupo;
//      b) quantidade de mulheres com salário até R$1500,00

package EstruturaRepeticao;

import java.util.Scanner;

public class exercicioOito {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do grupo a ser pesquisado:");
        int groupSize = scanner.nextInt();

        int i = 1;
        int womanCount = 0;
        double totalSalary = 0;
        double average = 0;

        while (i <= groupSize) {
            System.out.println("Digite a idade do(a) participante:");
            int age = scanner.nextInt();

            System.out.println("Digite o sexo do(a) participante (Masculino - M; Feminino - F):");
            char sex = scanner.next().toUpperCase().charAt(0);

            System.out.println("Informe o salário do(a) participante:");
            double salary = scanner.nextDouble();

            if (sex == 'F' && salary <= 1500.00) {
                womanCount++;
            }

            totalSalary += salary;
            average = totalSalary / groupSize;

            i++;
        }

        System.out.println("A média salarial é de: " + average);
        System.out.println("A quantidade de participantes do sexo feminino com salário de até R$ 1.500 é de: " + womanCount);

        scanner.close();
    }
}
