package org.example;


import org.calculadora.calculadora.Calculadora;

import java.util.Scanner;

public class Main {

    private static final Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira variável 1: ");
        int variavel1 = scanner.nextInt();

        System.out.println("Escolha a operacao: ");
        String operacao = scanner.next();

        System.out.println("Insira a variável 2: ");
        int variavel2 = scanner.nextInt();

        Integer resultado = calculadora.calcular(variavel1, variavel2, operacao);

        System.out.println("Resultado: " + resultado);
    }
}