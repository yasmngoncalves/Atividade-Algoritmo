/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meuNome = "Yasmin";

        // Entrada
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Verificação
        if (nome.equalsIgnoreCase(meuNome)) {
            System.out.println("Pessoa com nome igual.");
        } else {
            System.out.println("Pessoa com o nome diferente.");
        }

        scanner.close();
        
    }
}
