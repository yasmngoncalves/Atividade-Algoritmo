/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        // Entrada: solicitar idade ao usuário
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Verificação da idade
        if (idade > 21) {
            System.out.println("Você tem mais de 21 anos.");
        } else if (idade == 21) {
            System.out.println("Você tem 21 anos.");
        } else {
            System.out.println("Você tem menos de 21 anos.");
        }

        scanner.close();
    }
}
