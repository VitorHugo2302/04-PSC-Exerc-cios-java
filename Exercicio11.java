/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.pkg25.pkg03.pkg24;

/**
 *
 * @author 42414189
 */
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.print("Digite a massa (para encerrar digite 0): ");
            double massaInicial = entrada.nextInt();

            if (massaInicial == 0) {
                break;
            }
            double taxaPerda = 0.25;
            double massaMinima = 0.10;
            int tempoSegundos = 0;

            while (massaInicial >= massaMinima) {
                massaInicial *= (1 - taxaPerda);
                tempoSegundos += 30;
            }

            System.out.println("Tempo necessário para a massa ficar menor que " + massaMinima + " gramas: " + tempoSegundos + " segundos.");
        }

        System.out.print("Programa encerrado.");
    }
}
