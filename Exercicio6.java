/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.pkg25.pkg03.pkg24;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 42414189
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente = true;

        System.out.println("Bem-vindo ao jogo de adivinhação! Estou pensando em um número entre 1 e 100...\nTente adivinhar qual é!");

        while (jogarNovamente) {
            int numeroSecreto = random.nextInt(100) + 1;
            int tentativas = 0;
            boolean acertou = false;

            while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = entrada.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto. Tente novamente.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }

            System.out.print("Deseja jogar novamente? (S/N): ");
            String resposta = entrada.next();

            if (!resposta.equalsIgnoreCase("S")) {
                jogarNovamente = false;
                System.out.println("Programa encerrado.");
            }
        }

        entrada.close();
    }
}
