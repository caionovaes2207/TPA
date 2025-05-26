/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosscanner;

/**
 *
 * @author Caio Novaes
 */
import java.util.Scanner;
public class ExerciciosScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int opcao; 
        String continuar;
        
 //EXERCICIO 1 - CALCULADORA SIMPLES
  
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha a operação: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }
        

        System.out.println("Resultado: " + resultado);
        
     // EXERCICIO 2 - CONVERSOR DE TEMPERATURA
    
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");
 
      // EXERCICIO 3 - VERIFICAR NUMERO PRIMO
      
      do {
            System.out.print("Digite um número inteiro para verificar se é primo: ");
            int numero = scanner.nextInt();

            if (numero <= 1) {
                System.out.println(numero + " não é primo.");
            } else {
                boolean primo = true;
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }

                if (primo) {
                    System.out.println(numero + " é primo!");
                } else {
                    System.out.println(numero + " não é primo.");
                }
            }

            System.out.print("Deseja verificar outro número? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));
      
      // EXERCICIO 4 - CALCULADORA DE MEDIA
      
      double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A média das notas é: %.2f\n", media);
        
       // EXERCICIO 5 - TABUADA
       System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
      // EXERCICIO 6 - DADOS DO USUARIO
      
System.out.println("\n=== Exercício 6 - Cadastro de Dados Pessoais ===");
scanner.nextLine(); // Limpar o buffer antes de ler textos

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
String dataNascimento = scanner.nextLine();

System.out.print("Digite o nome do curso: ");
String curso = scanner.nextLine();

System.out.print("Digite a série: ");
String serie = scanner.nextLine();

// Solução: limpar o buffer antes de ler altura
System.out.print("Digite sua altura (ex: 1.75): ");
double altura = scanner.nextDouble();

System.out.print("Digite seu peso (em kg): ");
double peso = scanner.nextDouble();
        
     scanner.close();
    }
}