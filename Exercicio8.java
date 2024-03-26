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

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número real A: ");
        double A = entrada.nextDouble();

        System.out.print("Digite o número inteiro B: ");
        int B = entrada.nextInt();

        double produto = 0;

        for (int i = 0; i < Math.abs(B); i++) {
            produto += A;
        }

        if (B < 0) {
            produto = -produto;
        }
        System.out.println("O produto de " + A + " por " + B + " é igual a: " + produto);

        entrada.close();
    }

}
