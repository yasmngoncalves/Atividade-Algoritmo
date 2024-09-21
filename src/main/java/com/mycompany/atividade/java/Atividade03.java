/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir o valor do salário mínimo
        double salarioMinimo = 1320.00; 
        
        // Entrada
        System.out.print("Digite o valor do seu salário: ");
        double salario = scanner.nextDouble();
        
        // Verificação
        if (salario > 5 * salarioMinimo) {
            System.out.println("Seu salário é 5 vezes maior que o salário mínimo.");
        } else {
            System.out.println("Seu salário não é 5 vezes maior que o salário mínimo.");
        }
        
        scanner.close();
    }
}
