// Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das
//seguintes categorias:
//  infantil A = 5 - 7 anos
//  infantil B = 8-10 anos
//  juvenil A = 11-13 anos
//  juvenil B = 14-17 anos
//  adulto = maiores de 18 anos

package EstruturaSelecao;

import java.util.Scanner;

public class exercicioSete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        double age = scanner.nextDouble();

        if (age >= 18) {
            System.out.println("CATEGORIA: Adulto");
        } else if (age >= 14 && age <= 17) {
            System.out.println("CATEGORIA: Juvenil B");
        } else if (age >= 11 && age <= 13) {
            System.out.println("CATEGORIA: Juvenil A");
        } else if (age >= 8 && age <= 10) {
            System.out.println("CATEGORIA: Infantil B");
        } else {
            System.out.println("CATEGORIA: Infantil A");
        }

        scanner.close();
    }
}
