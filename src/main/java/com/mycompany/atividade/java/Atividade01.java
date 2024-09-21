/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
               
            // Entradas
            System.out.print("Digite o valor total da fatura: ");
            double valorTotal = sc.nextDouble();
            
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = sc.nextInt();
            
            System.out.print("Digite o percentual de desconto para pagamento antecipado: ");
            double percentualDesconto = sc.nextDouble();
            
            System.out.print("Digite o percentual de multa por atraso: ");
            double percentualMulta = sc.nextDouble();
            
            // Cálculo do valor com desconto
            double valorComDesconto = valorTotal - (valorTotal * percentualDesconto / 100);
            
            // Cálculo do valor da parcela sem multa
            double valorParcela = valorTotal / numeroParcelas;
            
            // Cálculo da multa por parcela
            double multa = valorParcela * percentualMulta / 100;
            
            // Cálculo do valor da parcela com multa
            double valorParcelaComMulta = valorParcela + multa;
            
            // Saída
            System.out.println("\nValor total com desconto para pagamento antecipado: R$ " + valorComDesconto);
            
            for (int i = 1; i <= numeroParcelas; i++) {
                System.out.println("Parcela " + i + ": Valor com multa: R$ " + valorParcelaComMulta +
                        " (Multa de R$ " + multa + ")");
            }   
        
    }
}
