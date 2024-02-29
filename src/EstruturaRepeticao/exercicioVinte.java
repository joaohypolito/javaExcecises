// Chico tem 1,50m e cresce 2 centímetros por ano enquanto Juca tem 1,10m e cresce 3 centímetros por ano.
// Construir um algoritmo que calcule e imprima quantos anos serão necessários para que Juca seja maior que Chico.

package EstruturaRepeticao;

public class exercicioVinte {

    public static void main(String[] args) {

        double chico = 1.50;
        double juca = 1.10;
        int yearsCount = 0;

        do {
            chico += 0.02;
            juca += 0.03;
            yearsCount++;
        } while (juca <= chico);

        System.out.println("Foram necessários " + yearsCount + " anos para Juca ficar mais alto que Chico.");

    }
}
