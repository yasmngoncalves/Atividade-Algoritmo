/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o seu gênero (f para feminino, m para masculino): ");
        char genero = scanner.next().charAt(0);

        // Verificação
        if (Character.toLowerCase(genero) == 'f') {
            System.out.println("O gênero é igual a 'f' (feminino).");
        } else {
            System.out.println("O gênero não é igual a 'f' (feminino).");
        }

        scanner.close();
        
    }
}
