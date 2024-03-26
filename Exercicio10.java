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
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroFichas = 5;
        int[] matriculas = new int[numeroFichas];
        double[] notas = new double[numeroFichas];

        // Leitura das fichas
        for (int i = 0; i < numeroFichas; i++) {
            System.out.print("Digite o número de matrícula do aluno " + (i + 1) + ": ");
            matriculas[i] = entrada.nextInt();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        int indicePrimeiraMaiorNota = 0;
        int indiceSegundaMaiorNota = -1;
        double maiorNota = notas[indicePrimeiraMaiorNota];

        for (int i = 1; i < numeroFichas; i++) {
            if (notas[i] > maiorNota) {
                indiceSegundaMaiorNota = indicePrimeiraMaiorNota;
                indicePrimeiraMaiorNota = i;
                maiorNota = notas[i];
            } else if (notas[i] > notas[indiceSegundaMaiorNota]) {
                indiceSegundaMaiorNota = i;
            }
        }

        System.out.println("As duas maiores notas são:");
        System.out.println("Primeira maior nota: " + notas[indicePrimeiraMaiorNota] +
                ", Número de Matrícula: " + matriculas[indicePrimeiraMaiorNota]);
        System.out.println("Segunda maior nota: " + notas[indiceSegundaMaiorNota] +
                ", Número de Matrícula: " + matriculas[indiceSegundaMaiorNota]);

        entrada.close();
    }
}
