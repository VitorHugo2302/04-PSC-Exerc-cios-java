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
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantPessoasMais50 = 0;
        int pessoasEntre10e20 = 0;
        int pessoasComMenosDe40 = 0;
        double somaAltura = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a sua idade: ");
            int idade = entrada.nextInt();
            System.out.print("Digite a sua altura (em cm): ");
            int altura = entrada.nextInt();
            System.out.print("Digite o seu peso: ");
            double peso = entrada.nextDouble();

            if (idade > 50) {
                quantPessoasMais50++;
            }

            if (idade >= 10 && idade <= 20) {
                pessoasEntre10e20++;
                somaAltura += altura;
            }

            if (peso < 40) {
                pessoasComMenosDe40++;
            }
        }

        double mediaAltura = 0;
        if (pessoasEntre10e20 > 0) {
            mediaAltura = somaAltura / pessoasEntre10e20;
        }
        
        double porcentagem = 0;
        if (pessoasEntre10e20 > 0) {
            porcentagem = (pessoasComMenosDe40 / 10) * 100;
        }
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + quantPessoasMais50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAltura);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas: " + porcentagem + "%");
    }
}
