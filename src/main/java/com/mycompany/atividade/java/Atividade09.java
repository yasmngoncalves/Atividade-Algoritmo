/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        // Verificação e saída
        System.out.println("\nVerificações:");

        if (idade == minhaIdade) {
            System.out.println("Idade igual.");
        } else {
            System.out.println("Idade diferente.");
        }

        if (peso == meuPeso) {
            System.out.println("Peso igual.");
        } else {
            System.out.println("Peso diferente.");
        }

        if (altura == minhaAltura) {
            System.out.println("Altura igual.");
        } else {
            System.out.println("Altura diferente.");
        }

        if (serieFavorita.equalsIgnoreCase(minhaSerieFavorita)) {
            System.out.println("Série favorita igual.");
        } else {
            System.out.println("Série favorita diferente.");
        }

        if (musicaFavorita.equalsIgnoreCase(minhaMusicaFavorita)) {
            System.out.println("Música favorita igual.");
        } else {
            System.out.println("Música favorita diferente.");
        }

        if (jogoFavorito.equalsIgnoreCase(meuJogoFavorito)) {
            System.out.println("Jogo favorito igual.");
        } else {
            System.out.println("Jogo favorito diferente.");
        }

        scanner.close();
        
    }
}
