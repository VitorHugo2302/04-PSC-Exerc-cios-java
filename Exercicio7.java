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

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Retângulo");
            System.out.println("2. Diagonal Superior Esquerda");
            System.out.println("3. Diagonal Superior Direita");
            System.out.println("4. Diagonal Inferior Esquerda");
            System.out.println("5. Diagonal Inferior Direita");
            System.out.println("0. Encerrar o programa");
            
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite a quantidade de colunas: ");
            int colunas = entrada.nextInt();

            switch (opcao) {
                case 1:
                    desenharRetangulo(colunas);
                    break;
                case 2:
                    desenharDiagonalSuperiorEsquerda(colunas);
                    break;
                case 3:
                    desenharDiagonalSuperiorDireita(colunas);
                    break;
                case 4:
                    desenharDiagonalInferiorEsquerda(colunas);
                    break;
                case 5:
                    desenharDiagonalInferiorDireita(colunas);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        entrada.close();
    }

    public static void desenharRetangulo(int colunas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalSuperiorEsquerda(int colunas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalSuperiorDireita(int colunas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalInferiorEsquerda(int colunas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= 4 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalInferiorDireita(int colunas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= 4 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
