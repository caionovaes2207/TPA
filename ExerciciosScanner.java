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
        Scanner entrada = new Scanner(System.in); 
        int opcao; 

        do {
            // Exibe o menu principal para o usuário
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Calculadora Simples");
            System.out.println("2 - Conversor de Temperatura");
            System.out.println("3 - Verificador de Número Primo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt(); // Lê a opção digitada pelo usuário

            // Executa uma ação com base na opção escolhida
            switch (opcao) {
                case 1:
                    calculadora(entrada); // Chama o método da calculadora
                    break;
                case 2:
                    conversorTemperatura(entrada); // Chama o método do conversor de temperatura
                    break;
                case 3:
                    verificadorPrimo(entrada); // Chama o método do verificador de número primo
                    break;
                case 0:
                    System.out.println("Encerrando o programa..."); // Mensagem ao sair do programa
                    break;
                default:
                    System.out.println("Opção inválida."); // Caso o usuário digite uma opção não prevista
            }
        } while (opcao != 0); // Repete o menu enquanto a opção for diferente de zero

        entrada.close(); 
    }

    
    // EXERCÍCIO 1 - CALCULADORA SIMPLES
    
    public static void calculadora(Scanner entrada) {
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble(); // Lê o primeiro número

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0); // Lê o caractere da operação

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble(); // Lê o segundo número

        double resultado; // Variável para armazenar o resultado

        if (operacao == '+') { // Soma
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '-') { // Subtração
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '*') { // Multiplicação
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '/') { // Divisão
            if (num2 != 0) { // Evita divisão por zero
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else { // Operação inválida
            System.out.println("Operação inválida.");
        }
    }

    
    // EXERCÍCIO 2 - CONVERSOR DE TEMPERATURA
    
    public static void conversorTemperatura(Scanner entrada) {
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble(); // Lê a temperatura em Celsius

        // Converte para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        // Converte para Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados das conversões
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);
    }

    
    // EXERCÍCIO 3 - VERIFICADOR DE NÚMERO PRIMO
    
    public static void verificadorPrimo(Scanner entrada) {
        int numero; // Variável para armazenar o número que será verificado

        System.out.println("=== Verificador de Números Primos ===");
        System.out.println("Digite 0 para sair."); // Instrução para encerrar

        while (true) {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt(); // Lê o número digitado

            if (numero == 0) { // Se for zero, encerra o loop e o programa
                System.out.println("Programa encerrado.");
                break;
            }

            if (numero < 2) { // Números menores que 2 não são primos
                System.out.println(numero + " não é primo.");
            } else {
                boolean primo = true; // Assume que é primo até encontrar um divisor

                // Verifica divisores até a raiz quadrada do número
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) { // Se encontrar divisor, não é primo
                        primo = false;
                        break;
                    }
                }

                // Exibe o resultado
                if (primo) {
                    System.out.println(numero + " é primo.");
                } else {
                    System.out.println(numero + " não é primo.");
                }
            }
        }
    }
}
    

