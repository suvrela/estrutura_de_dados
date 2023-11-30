/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_avaliativa;

/**
 *
 * @author suvrela
 */
import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
        // Criação do vetor com 10 nomes
        String[] nomes = new String[10];

        // Leitura dos nomes
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicitação do nome a ser buscado
        System.out.print("Digite o nome a ser buscado: ");
        String nomeBuscado = scanner.nextLine();

        // Verifica se o nome está no vetor
        boolean encontrou = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrou = true;
                break;
            }
        }

        // Exibe o resultado
        if (encontrou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }

        // Fecha o scanner
        scanner.close();
    }
}