/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo suas informações
        int minhaIdade = 24; 
        double meuPeso = 60.0; 
        double minhaAltura = 1.73; 
        String minhaSerieFavorita = "Stranger Things"; 
        String minhaMusicaFavorita = "Stray Kids"; 
        String meuJogoFavorito = "Stardew Valley"; 

        // Entrada
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Digite sua série favorita: ");
        String serieFavorita = scanner.nextLine();

        System.out.print("Digite sua música favorita: ");
        String musicaFavorita = scanner.nextLine();

        System.out.print("Digite seu jogo favorito: ");
        String jogoFavorito = scanner.nextLine();

        // Contador de características iguais
        int contadorIguais = 0;

        // Verificação e saída para cada informação
        if (idade == minhaIdade) {
            contadorIguais++;
        }

        if (peso == meuPeso) {
            contadorIguais++;
        }

        if (altura == minhaAltura) {
            contadorIguais++;
        }

        if (serieFavorita.equalsIgnoreCase(minhaSerieFavorita)) {
            contadorIguais++;
        }

        if (musicaFavorita.equalsIgnoreCase(minhaMusicaFavorita)) {
            contadorIguais++;
        }

        if (jogoFavorito.equalsIgnoreCase(meuJogoFavorito)) {
            contadorIguais++;
        }

        // Verificação
        if (contadorIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa não é tão parecida comigo.");
        }

        scanner.close();
        
    }
}
