/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.pkg4.fabricio;

import java.util.Scanner;

/**
 *
 * @author Vitor Hugo
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos números deseja gerar: ");
        int n = entrada.nextInt();

        int valor, posicao = 1, controle = 1, numerosGerados = 0;

        while (posicao <= n) {
            valor = controle;
            
            if (numerosGerados < n) {
                System.out.print(valor + " ");
                numerosGerados++;
            }
            posicao += 1;
            valor += 3;
            
            for (int i = 0; i < 2; i++) {
                
                if (numerosGerados < n) {
                    System.out.print(valor + " ");
                    numerosGerados++;
                }
                
                posicao += 1;
            }
            controle += 1;
        }

        entrada.close();
    }
}

