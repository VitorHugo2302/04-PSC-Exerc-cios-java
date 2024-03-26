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

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produtoImpares = 1;
        int somaPares = 0;

        while (true) {
            System.out.print("Digite um número inteiro e positivo(para encerrar, digite um número negativo): ");
            int numero = entrada.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 2 != 0) {
                produtoImpares *= numero;
            } else if (numero % 2 == 0) {
                somaPares += numero;
            }
        }

        System.out.println("Produto dos números ímpares: " + produtoImpares);
        System.out.println("Soma dos números pares: " + somaPares);

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
