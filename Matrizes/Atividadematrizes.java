/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadematrizes;

/**
 *
 * @author caio novaes
 */
 import java.util.Arrays;
 import java.util.Scanner;
public class Atividadematrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      
        // atividade 1
        System.out.println(" 1) Matriz 4x4 - Soma e média dos números pares ");
        int[][] m1 = new int[4][4];
        int somaPares1 = 0;
        int qtdPares1 = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite m1[" + i + "][" + j + "]: ");
                m1[i][j] = sc.nextInt();
                if (m1[i][j] % 2 == 0) {
                    somaPares1 += m1[i][j];
                    qtdPares1++;
                }
            }
        }

        double mediaPares1 = (qtdPares1 > 0) ? (double) somaPares1 / qtdPares1 : 0;
        System.out.println("Soma dos números pares: " + somaPares1);
        System.out.println("Média dos números pares: " + mediaPares1);
        System.out.println();
        

        // atividade 2
        System.out.println(" 2) Matrizes fixas (3x5) ");

        // 2a) letras (conforme imagem)
        char[][] letras = {
            {'a','b','c','d','e'},
            {'f','g','h','i','j'},
            {'q','r','s','t','u'}
        };
        System.out.println("2a) Matriz de letras (3x5):");
        for (char[] linha : letras) {
            for (char c : linha) System.out.print(c + " ");
            System.out.println();
        }
        System.out.println();

        // 2b) inteiros (exemplo da imagem - ajustei posição)
        int[][] nums2b = {
            {19, 25, 100, 99,  0},
            {10, 27,  25, 14,  0},
            {35,  2,  47, 74,  0}
        };
        System.out.println("2b) Matriz de inteiros (3x5):");
        for (int[] linha : nums2b) {
            for (int n : linha) System.out.print(n + " ");
            System.out.println();
        }
        System.out.println();

        // 2c) decimais (exemplo da imagem)
        double[][] dec2c = {
            {1.9, 2.5, 10.0, 0.0, 0.0},
            {1.0, 7.8,  2.5, 0.0, 0.0},
            {3.5, 2.2,  4.7, 0.0, 0.0}
        };
        System.out.println("2c) Matriz de decimais (3x5):");
        for (double[] linha : dec2c) {
            for (double d : linha) System.out.print(d + " ");
            System.out.println();
        }
        System.out.println();


        // atividade 3
        System.out.println(" 3) Matriz 5x5 - Somar ímpares, somas de colunas e linhas ");
        int[][] m3 = new int[5][5];
        int somaImpares3 = 0;
        int[] somaColunas3 = new int[5];
        int[] somaLinhas3 = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite m3[" + i + "][" + j + "]: ");
                m3[i][j] = sc.nextInt();
                if (m3[i][j] % 2 != 0) somaImpares3 += m3[i][j];
                somaLinhas3[i] += m3[i][j];
                somaColunas3[j] += m3[i][j];
            }
        }

        System.out.println("Soma dos números ímpares: " + somaImpares3);
        System.out.println("Soma de cada coluna:");
        for (int j = 0; j < 5; j++) System.out.println("Coluna " + j + ": " + somaColunas3[j]);
        System.out.println("Soma de cada linha:");
        for (int i = 0; i < 5; i++) System.out.println("Linha " + i + ": " + somaLinhas3[i]);
        System.out.println();

        
        // atividade 4
        System.out.println("4) Matriz 3x5 - Repetidos, quantidade pares/ímpares ");
        int[][] m4 = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite m4[" + i + "][" + j + "]: ");
                m4[i][j] = sc.nextInt();
            }
        }

        // verificar repetidos (comparação par-a-par, sem contar mesmo índice)
        boolean temRepetidos = false;
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int x = i; x < 3; x++) {
                    for (int y = (x == i ? j + 1 : 0); y < 5; y++) {
                        if (m4[i][j] == m4[x][y]) {
                            temRepetidos = true;
                            break outer;
                        }
                    }
                }
            }
        }

        int pares4 = 0, impares4 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (m4[i][j] % 2 == 0) pares4++;
                else impares4++;
            }
        }

        System.out.println("Possui elementos repetidos? " + (temRepetidos ? "Sim" : "Não"));
        System.out.println("Quantidade de números pares: " + pares4);
        System.out.println("Quantidade de números ímpares: " + impares4);
        System.out.println();

    
        // atividade 5
        System.out.println(" 5) Matriz 4x4 (double) - Diagonais ");
        double[][] m5 = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite m5[" + i + "][" + j + "]: ");
                m5[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(m5[i][i] + " ");
        }
        System.out.println();

        System.out.println("Diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(m5[i][3 - i] + " ");
        }
        System.out.println("\n");

    
        // atividade 6
        System.out.println(" 6) Figuras com matrizes ");

        // 6a) quadrado cheio 5x5
        System.out.println("6a) Quadrado cheio 5x5:");
        char[][] figA = new char[5][5];
        for (int i = 0; i < 5; i++)
            Arrays.fill(figA[i], '*');

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print(figA[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        // 6b) quadrado vazado 5x5
        System.out.println("6b) Quadrado vazado 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        // 6c) triângulo crescente (lado esquerdo)
        System.out.println("6c) Triângulo (linhas crescentes):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        sc.close();
        
    }
}




