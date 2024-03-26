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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produtoImpares = 1;
        int somaPares = 0;

        while (true) {
            System.out.print("Digite um número(para encerrar, digite um número ou zero negativo): ");
            int numero = entrada.nextInt();

            if (numero <= 0) {
                break;
            }

            System.out.println("Valor lido: " + numero);
            System.out.println("Quadrado do valor lido: " + (numero * numero));
            System.out.println("Cubo do valor lido: " + (numero * numero * numero));
            System.out.println("Raiz quadrada do valor lido: " + Math.sqrt(numero));
        }

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
