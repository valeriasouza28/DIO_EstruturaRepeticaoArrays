package org.example;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        /* Faça umprograma que peça N números inteiros,
         * calcule e mostre a quantidade de números pares
         * e a quantidade de números impares.*/

        /*Para que possa ler dados digitados do teclado*/

        Scanner scan = new Scanner(System.in);

                       /*Variáveis*/
        int QuantDeVezes; // variavel que pega do usuário quantas vezes o campo de digitação se repete
        int numero; //variável que pega os números digitados após o usuário determinar a qutidade de vezes
        int quantPares = 0, quantImpares = 0;//Variaveis para armezenar números pares e números impares.

        //Colocamos uma mensagem para especificar o que é para ser digitado.
        System.out.println("Quantas vezes digitar número? : ");
        QuantDeVezes = scan.nextInt(); /*Capturamos o número digitado para repetir o
                                        campo para digitar um número.*/


        int count = 0; //contador, para contar quantas vezes o laço do-while vai se repetir
        do {
            System.out.println("Número:"); //Pedimos para digitar um número
            numero = scan.nextInt(); /*Capturar numeros digitado na quantidade de vezes
                                       especificada na variável Quant numeros para se repetir*/


            /*Descobrir se determinado número é para ou impar*/

            if (numero % 2 == 0) quantPares++; /* Se a divisão do número digitado dividido por 2,
                                                ter o resto dessa divisão igual a zero esse número será par*/
            else quantImpares++; //Caso contrário ele será impar.


            count = count + 1;//Incremento do contador

        } while (count < QuantDeVezes);
        /* O limite do while vai ser a quantidade digitada pelo o usuário. A condição do  while é que o
         * contador tem que ser menor que a quantidade de números digitadas */

        
        System.out.println("\n   Quatidade de números Pares: " + quantPares); // Exibir números pares.
        System.out.println("\n   Quantidade de números Impares: " + quantImpares);//Exibir números impares

    }
}