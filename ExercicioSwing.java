/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioswing;

/**
 *
 * @author caio novaes
 */
import javax.swing.*;
import java.awt.event.*;

public class ExercicioSwing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercícios em Java com Swing");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane abas = new JTabbedPane();

        // Exercicio 1: Idade em dias
        JPanel painel1 = new JPanel();
        painel1.setLayout(null);
        JTextField anos = new JTextField();
        JTextField meses = new JTextField();
        JTextField dias = new JTextField();
        JLabel resultado1 = new JLabel();
        JButton calc1 = new JButton("Calcular");

        anos.setBounds(150, 20, 150, 25);
        meses.setBounds(150, 50, 150, 25);
        dias.setBounds(150, 80, 150, 25);
        painel1.add(new JLabel("Anos:")).setBounds(20, 20, 100, 25);
        painel1.add(new JLabel("Meses:")).setBounds(20, 50, 100, 25);
        painel1.add(new JLabel("Dias:")).setBounds(20, 80, 100, 25);
        painel1.add(anos);
        painel1.add(meses);
        painel1.add(dias);
        calc1.setBounds(120, 120, 120, 30);
        resultado1.setBounds(20, 170, 300, 25);
        calc1.addActionListener(e -> {
            int a = Integer.parseInt(anos.getText());
            int m = Integer.parseInt(meses.getText());
            int d = Integer.parseInt(dias.getText());
            int total = a * 365 + m * 30 + d;
            resultado1.setText("Total em dias: " + total);
        });
        painel1.add(calc1);
        painel1.add(resultado1);

        // Exercicio 2: Médias
        JPanel painel2 = new JPanel();
        painel2.setLayout(null);
        JTextArea resultado2 = new JTextArea();
        JButton calc2 = new JButton("Calcular");
        calc2.setBounds(120, 20, 120, 30);
        resultado2.setBounds(20, 70, 320, 100);
        resultado2.setEditable(false);
        calc2.addActionListener(e -> {
            double m1 = (8 + 9 + 7) / 3.0;
            double m2 = (4 + 5 + 6) / 3.0;
            double soma = m1 + m2;
            double mediaFinal = soma / 2;
            resultado2.setText(String.format("Média 1: %.2f\nMédia 2: %.2f\nSoma: %.2f\nMédia das médias: %.2f", m1, m2, soma, mediaFinal));
        });
        painel2.add(calc2);
        painel2.add(resultado2);

        // Exercicio 3: Reajuste saldo
        JPanel painel3 = new JPanel();
        painel3.setLayout(null);
        JTextField saldo = new JTextField();
        JLabel resultado3 = new JLabel();
        JButton calc3 = new JButton("Reajustar");
        saldo.setBounds(150, 20, 150, 25);
        painel3.add(new JLabel("Saldo: R$")).setBounds(20, 20, 100, 25);
        painel3.add(saldo);
        calc3.setBounds(120, 60, 120, 30);
        resultado3.setBounds(20, 110, 300, 25);
        calc3.addActionListener(e -> {
            double s = Double.parseDouble(saldo.getText());
            resultado3.setText(String.format("Novo saldo: R$ %.2f", s * 1.01));
        });
        painel3.add(calc3);
        painel3.add(resultado3);

        // Exercicio 4: Cálculo com IPI
        JPanel painel4 = new JPanel();
        painel4.setLayout(null);
        JTextField ipi = new JTextField(), v1 = new JTextField(), q1 = new JTextField(),
                v2 = new JTextField(), q2 = new JTextField();
        JLabel resultado4 = new JLabel();
        JButton calc4 = new JButton("Calcular");
        painel4.add(new JLabel("IPI (%):")).setBounds(20, 10, 100, 25); ipi.setBounds(150, 10, 150, 25);
        painel4.add(new JLabel("Valor peça 1:")).setBounds(20, 40, 100, 25); v1.setBounds(150, 40, 150, 25);
        painel4.add(new JLabel("Qtd peça 1:")).setBounds(20, 70, 100, 25); q1.setBounds(150, 70, 150, 25);
        painel4.add(new JLabel("Valor peça 2:")).setBounds(20, 100, 100, 25); v2.setBounds(150, 100, 150, 25);
        painel4.add(new JLabel("Qtd peça 2:")).setBounds(20, 130, 100, 25); q2.setBounds(150, 130, 150, 25);
        painel4.add(ipi); painel4.add(v1); painel4.add(q1); painel4.add(v2); painel4.add(q2);
        calc4.setBounds(120, 170, 120, 30);
        resultado4.setBounds(20, 210, 320, 25);
        calc4.addActionListener(e -> {
            double i = Double.parseDouble(ipi.getText());
            double valor1 = Double.parseDouble(v1.getText());
            int quant1 = Integer.parseInt(q1.getText());
            double valor2 = Double.parseDouble(v2.getText());
            int quant2 = Integer.parseInt(q2.getText());
            double total = (valor1 * quant1 + valor2 * quant2) * (i / 100 + 1);
            resultado4.setText(String.format("Total a pagar: R$ %.2f", total));
        });
        painel4.add(calc4);
        painel4.add(resultado4);

        // Exercicio 5: Salários mínimos
        JPanel painel5 = new JPanel();
        painel5.setLayout(null);
        JTextField salarioUser = new JTextField();
        JLabel resultado5 = new JLabel();
        JButton calc5 = new JButton("Calcular");
        painel5.add(new JLabel("Salário do usuário:")).setBounds(20, 20, 130, 25);
        salarioUser.setBounds(160, 20, 150, 25);
        calc5.setBounds(120, 60, 120, 30);
        resultado5.setBounds(20, 110, 320, 25);
        calc5.addActionListener(e -> {
            double salario = Double.parseDouble(salarioUser.getText());
            resultado5.setText(String.format("Equivale a %.2f salários mínimos", salario / 1000.0));
        });
        painel5.add(salarioUser);
        painel5.add(calc5);
        painel5.add(resultado5);

        // Exercicio 6: Antecessor e Sucessor
        JPanel painel6 = new JPanel();
        painel6.setLayout(null);
        JTextField numero = new JTextField();
        JLabel resultado6 = new JLabel();
        JButton calc6 = new JButton("Calcular");
        painel6.add(new JLabel("Digite um número:")).setBounds(20, 20, 120, 25);
        numero.setBounds(150, 20, 150, 25);
        calc6.setBounds(120, 60, 120, 30);
        resultado6.setBounds(20, 110, 320, 25);
        calc6.addActionListener(e -> {
            int num = Integer.parseInt(numero.getText());
            resultado6.setText("Antecessor: " + (num - 1) + " | Sucessor: " + (num + 1));
        });
        painel6.add(numero);
        painel6.add(calc6);
        painel6.add(resultado6);

        // Adiciona todos os exercicios
        abas.add("Idade em Dias", painel1);
        abas.add("Médias", painel2);
        abas.add("Saldo Reajustado", painel3);
        abas.add("Cálculo com IPI", painel4);
        abas.add("Salários Mínimos", painel5);
        abas.add("Antecessor e Sucessor", painel6);

        frame.add(abas);
        frame.setVisible(true);
    }
}
