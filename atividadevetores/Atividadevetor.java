/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadevetor;

/**
 *
 * @author Isabelly
 */
 import java.util.Arrays;
import java.util.Scanner;
public class Atividadevetor {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);

        // atividade 1
        System.out.print("Quantos números você quer digitar? ");
        int qtdNumeros = entrada.nextInt();

        int[] numeros = new int[qtdNumeros];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nNúmeros Pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println("\n\nNúmeros Ímpares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        // atividade 2
        System.out.println("\n\n--------------------------------------");
        System.out.print("Quantos nomes você quer digitar? ");
        int qtdNomes = entrada.nextInt();
        entrada.nextLine(); // limpar o buffer

        String[] nomes = new String[qtdNomes];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = entrada.nextLine();
        }

        // Ordem crescente
        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem crescente:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // Ordem decrescente
        System.out.println("\nNomes em ordem decrescente:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        entrada.close();
    }
}
    

