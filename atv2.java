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

public class atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar o vetor para armazenar os 20 números inteiros
        int[] numeros = new int[20];

        // Pedir ao usuário para inserir os 20 números inteiros
        System.out.println("Digite 20 numeros inteiros:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Criar os vetores para armazenar os números pares e ímpares
        int[] pares = new int[20];
        int[] impares = new int[20];

        int indicePares = 0;
        int indiceImpares = 0;

        // Separar os números pares e ímpares nos vetores correspondentes
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                pares[indicePares] = numeros[i];
                indicePares++;
            } else {
                impares[indiceImpares] = numeros[i];
                indiceImpares++;
            }
        }

        // Imprimir os três vetores
        System.out.println("\nNumeros Originais:");
        imprimirVetor(numeros);

        System.out.println("\nNumeros Pares:");
        imprimirVetor(pares, indicePares);

        System.out.println("\nNumeros Impares:");
        imprimirVetor(impares, indiceImpares);

        scanner.close();
    }

    // Método para imprimir um vetor
    private static void imprimirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Método sobrecarregado para imprimir apenas parte do vetor
    private static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
