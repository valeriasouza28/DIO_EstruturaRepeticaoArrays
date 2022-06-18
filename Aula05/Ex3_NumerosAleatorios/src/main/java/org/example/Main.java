package org.example;

import java.util.Random;

/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os no vetor.
* Ao final mostre os números e seus sucessores.*/
public class Main {
    public static void main(String[] args) {

        //inicia classe radom para gerar númeroos aleatórios
        Random random= new Random();

        //Cria uma de 20 lugars
        int[] numerosAleatorios = new int[20];

        // for irá se repetir enquanto o contador i for menor que o comprimento da array.
        for (int i = 0; i < numerosAleatorios.length; i++) {

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("Números Aleatórios: ");
        for ( int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for ( int numero: numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for ( int numero: numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}