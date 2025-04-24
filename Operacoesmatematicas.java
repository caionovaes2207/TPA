/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author Isabelly
 */
public class Operacoesmatematicas {

    public static void main(String[] args) {
    
  // definição de numeros
  double num1 = 10.5; // primeiro numero
  double num2 = 5.2;  // segundo numero
  double base = 8;    // base usada para áreas
  double altura = 6;  // altura usada para áreas
  double raio = base / 2; // diametro
  double diagonalmaior = 10; // diagonal maior do losango
  double diagonalmenor = 5; // diagonal menor do losango
  
  // ralizando operações matematicas
  double soma = num1 + num2; // soma dos dois numeros
  double subtracao = num1 - num2; // subtração do dois numeros
  double multiplicacao = num1 * num2; // multiplicação dos dois numeros
  double divisao = num2 != 0 ? num1 / num2 : Double.NaN; // divição dos numeros, verificano se o num2 e diferente de zero
  double resto = num1 % num2; // resto da divição entre num1 e num2
  double areaquadrado = base * altura; // calculo da area de um quadrado
  double arealosango = (diagonalmaior * diagonalmenor) / 2; // calculo da area do losango
  double arearetangulo = base * altura; // calculo da area do retangulo
  double areatriangulo = (base * altura) / 2; // calculo da area do triangulo
  double areacircunferencia = Math.PI * raio * raio; // calculo da area de uma circuferencia
  double media = (num1 + num2) / 2; // media de dois numeros
  
  // exibição dos resultados
  
  System.out.println("soma: " + soma);
  System.out.println("subtração: " + subtracao);
  System.out.println("multiplicação: " + multiplicacao);
  System.out.println("divição: " + divisao);
  System.out.println("resto: " + resto);
  System.out.println("area do quadrado: " + areaquadrado);
  System.out.println("area do losago: " + arealosango);
  System.out.println("area do retangulo: " + arearetangulo);
  System.out.println("area do triangulo: " + areatriangulo);
  System.out.println("area da cicunferencia: " + areacircunferencia);
  System.out.println("media: " + media);
  
  
 }  

    }

