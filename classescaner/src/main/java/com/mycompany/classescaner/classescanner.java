/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classescaner;

/**
 * 
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class classescanner {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //leitura de texto
    System.out.println("digite seu nome ");
    String nome = scanner.nextLine();
    
    System.out.println("digite sua idade ");
    int idade = scanner.nextInt();
    
    System.out.println("ola, " + nome + "! voce tem " + idade + " anos.");
    }
      
}
