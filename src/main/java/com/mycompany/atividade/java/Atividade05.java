/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        // Verificação
        if (peso > 70) {
            System.out.println("Seu peso é maior que 70 kg.");
        } else {
            System.out.println("Seu peso não é maior que 70 kg.");
        }

        scanner.close();
    }
}
