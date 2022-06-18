package org.example;

import java.util.Scanner;

public class Ex1NomeIdade {
    public static void main(String[] args) {
        /*Faça um programa que leia um conjunto de dois valores,
        o primeiro representado o nome do aluno e o segundo representando a idade do aluno.
        (Pare o programa inserindo o valor zero no campo nome.)*/
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        while (true) {

            System.out.println("Nome : ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade : ");
            idade = scan.nextInt();
        }

    }
}