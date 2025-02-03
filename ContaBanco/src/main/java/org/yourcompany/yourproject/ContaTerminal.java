/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 * 
 *
 * @author Páucinha
 */

 public class ContaTerminal {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Declaração das variáveis conforme os tipos indicados
        try ( // Criar o objeto Scanner para leitura dos dados do terminal
                Scanner scanner = new Scanner(System.in)) {
            // Declaração das variáveis conforme os tipos indicados
            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo;
            // Solicitar o número da conta
            System.out.println("Por favor, digite o número da conta: ");
            numeroConta = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer após a leitura de um número inteiro
            // Solicitar a agência
            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.nextLine();
            // Solicitar o nome do cliente
            System.out.println("Por favor, digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();
            // Solicitar o saldo
            System.out.println("Por favor, digite o saldo da conta: ");
            saldo = scanner.nextDouble();
            // Exibir as informações da conta após a coleta
            System.out.println("\n--- Dados da Conta Bancária ---");
            System.out.println("Número da Conta: " + numeroConta);
            System.out.println("Agência: " + agencia);
            System.out.println("Nome do Cliente: " + nomeCliente);
            System.out.println("Saldo: R$ " + saldo);
            // Fechar o objeto Scanner
        }
    }
}