/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.pkg25.pkg03.pkg24;

import java.util.Scanner;

/**
 *
 * @author 42414189
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char houveVencedor = 'S';

        do {
            System.out.print("Digite o número de kills: ");
            int numeroKills = entrada.nextInt();

            System.out.print("Digite o número de mortes: ");
            int numeroMortes = entrada.nextInt();

            System.out.print("Digite o número de assistências: ");
            int numeroAssistencia = entrada.nextInt();

            if (numeroKills <= 5) {
                System.out.println("Noob");
            } else if (numeroKills >= 20) {
                System.out.println("Master");
            }

            if (numeroMortes >= 20) {
                System.out.println("Houston, we have a problem");
            }

            if (numeroAssistencia >= 20) {
                System.out.println("Team work");
            }
            
            System.out.print("Houve um vencedor? (S/N): ");
            houveVencedor = entrada.next().charAt(0);
        } while (Character.toUpperCase(houveVencedor) == 'N');

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
