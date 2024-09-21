/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meuSobrenome = "Gonçalves"; 

        // Entrada
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Verificação
        if (!sobrenome.equalsIgnoreCase(meuSobrenome)) {
            System.out.println("O sobrenome é diferente do meu.");
        } else {
            System.out.println("O sobrenome é igual ao meu.");
        }

        scanner.close();
    }
}
