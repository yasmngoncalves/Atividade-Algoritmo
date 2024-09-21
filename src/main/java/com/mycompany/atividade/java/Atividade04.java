/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Verificação
        if (altura > 1.75) {
            System.out.println("Sua altura é maior que 1,75 m.");
        } else {
            System.out.println("Sua altura não é maior que 1,75 m.");
        }

        scanner.close();
    }
}
