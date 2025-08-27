/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioswitchcase;

/**
 *
 * @author caio novaes
 */
import java.util.Scanner;
public class Exercicioswitchcase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite um numero de 1 a 3 e veja a fruta que e");
        int frutas = entrada.nextInt();
        
        switch (frutas){
        
            case 1:
                System.out.println("a fruta e uma maçã");
                break;
            case 2:
                System.out.println("a fruta e uma banana");
                break;
            case 3:
                System.out.println("a fruta e uma laranja");
                break;
            default:
                System.out.println("numero invalido");               
       }
        
        System.out.println("coloque um numero de 1 a 5 para exibir o seu jogo favorito");
        int jogos = entrada.nextInt();
        
        switch (jogos){
            
            case 1:
                System.out.println("seu jogo favorito e minecraft");
                break;
            case 2:
                System.out.println("seu jogo favprito e FIFA");
                break;
            case 3:
                System.out.println("seu jogo favorito e fortnite");
                break;
            case 4:
                System.out.println("seu jogo favorito e call of duty, voce sabe o que e jogo de verdade");
                break;
            case 5:
                System.out.println("seu jogo favorito é the sims");
                break;
                
            default:
                System.out.println("o seu numero e invalido");
        }
        
        System.out.println("coloque um numero de 1 a 7 e saiba o dia da semana");
        int dia = entrada.nextInt();
        
        switch (dia){
            
            case 1:
                System.out.println("o dia da semana e segunda-feira");
                break;
            case 2:
                System.out.println("o dia da semana e terça-feira");
                break;
            case 3:
                System.out.println("o dia da semana e quarta-feira");
                break;
            case 4:
                System.out.println("o dia da semana e quinta-feira");
                break;
            case 5:
                System.out.println("o dia da semana e sexta-feira");
                break;
            case 6:
                System.out.println("o dia da semana e sabado");
                break;
            case 7:
                System.out.println("o dia da semana e domingo");
                break;
            default:
                System.out.println("o numero e invalido");
                
        }
    }
}
