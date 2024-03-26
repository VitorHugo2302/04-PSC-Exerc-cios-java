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
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char repetir;

        do {
            int populacaoA, populacaoB;
            double taxaCrescimentoA, taxaCrescimentoB;
            int anos = 0;

            System.out.print("Informe a população inicial do país A: ");
            populacaoA = entrada.nextInt();

            System.out.print("Informe a taxa de crescimento anual do país A (em decimal): ");
            taxaCrescimentoA = entrada.nextDouble();

            System.out.print("Informe a população inicial do país B: ");
            populacaoB = entrada.nextInt();

            System.out.print("Informe a taxa de crescimento anual do país B (em decimal): ");
            taxaCrescimentoB = entrada.nextDouble();

            while (populacaoA < populacaoB) {
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++;
            }

            System.out.println("Número de anos necessários para A ultrapassar B: " + anos);

            System.out.print("Deseja repetir a operação? (S/N): ");
            repetir = entrada.next().charAt(0);
        } while (Character.toUpperCase(repetir) == 'S');

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
