/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios3;

/**
 *
 * @author caio novaes
 */
import java.util.Scanner;
public class Exercicios3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // exercico 1
        System.out.println("Escolha e Compre seu biletes de trasporte publico");
        
        
        double preco = 0;
        double total;
        
        System.out.println("1-bilhete para onibus urbano R$4,40");
        System.out.println("2- bilhete para metro R$ 5,00");
        System.out.println("3- bilhete para trm intermunicipal R$6,50");
        System.out.println("4- bilhete para onibus rodoviario R$12,00");
        System.out.println("digite qual bilhete sera");
        int trasportes = entrada.nextInt();
        switch (trasportes){
            case 1:
                preco = 4.40;
                break;
            case 2 :
                preco= 5.00;
                break;
            case 3:
                preco = 6.50;
                break;
            case 4 :
                preco = 12.00;
                break;
            default:
                System.out.println("essa opção nao existe");
                return;
    }
        System.out.println("digite a quantidade de bilhetes");
        int quantidade = entrada.nextInt();
        total = preco * quantidade;
        System.out.println("o valor total e: R$ " + total);
        
        // exercicio 2
        System.out.println("O que o senhor deseja hoje");
        
        double saldo = 1000;
        double valor;
        
        System.out.println("1- consultar saldo");
        System.out.println("2- sacar denheiro");
        System.out.println("3- para depositar denheiro");
        System.out.println("4- encerrar o atendimento");
        System.out.println("digite o que deseja");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                System.out.println("o seu saldo atual e de R$ 1000");
                break;
            case 2 :
                System.out.println("degite o valor do saque");
                valor = entrada.nextInt();
                
                if (valor > saldo){
                    System.out.println("erro, o saldo e insuficiente");
                } else{
                    saldo -= valor;
                    System.out.println("saque realizado. novo saldo: R$ " + saldo);
                }
                break;
            case 3:
                System.out.println("digite o valor do deposito");
                valor = entrada.nextInt();
                saldo += valor;
                System.out.println("O valor agora e: R$ " + saldo);
                break;
            case 4:
                System.out.println("atendimento encerrado");
                break;
            default:
                System.out.println("numero invalido");
        }
        // exercicio 3
        System.out.println("digite a sua idade");
        int idade = entrada.nextInt();
        int faixa;
        if (idade >= 0 && idade <= 12){
            faixa = 1;
        } else if (idade >= 13 && idade <= 17) {
            faixa = 2;
        } else if (idade >= 18 && idade <= 59) {
            faixa = 3;
        } else {
            faixa = 4;
        }
        
        switch (faixa){
            case 1:
                System.out.println("voce e uma criança");
                break;
            case 2:
                System.out.println("voce e um adolecente");
                break;
            case 3:
                System.out.println("voce e um adulto");
                break;
            case 4:
                System.out.println("voce e idoso");
            default:
                System.out.println("esse numero e invalido");
        }
    }
}
