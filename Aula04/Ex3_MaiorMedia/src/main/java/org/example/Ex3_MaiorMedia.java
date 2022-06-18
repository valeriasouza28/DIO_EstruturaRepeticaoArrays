package org.example;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {

        /*Faça um programa que leia 5 números e informe o maior número e a média desses números.*/
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;


        do {
            System.out.println("Digite Um Número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if ( numero > maior) maior = numero;

            count = count + 1;
        }while(count < 5);
        System.out.println("\n    O maior número digitado: " +  maior);
        System.out.println("\n    A média dos números digitados: " + (soma/5));

    }
}