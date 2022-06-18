package org.example;

import java.util.Scanner;

/*faça um programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas.
* Imprima as consantes*/
public class Ex2_Consoantes {
    public static void main(String[] args) {

        //Pega dados digitados no teclado
        Scanner scan = new Scanner(System.in);

        //Cria array do tipo string, para armazenar 6 elementos
        String[] consoantes = new String[6];
        //ler Consoantes digitadas
        int quantidadeConsoantes = 0;

        //Variável contador
        int count = 0;
        //Cria looping do-while
        do{
            System.out.println("Digite uma consoante: ");
            //Captura letra digitada no teclado
            String letra = scan.next();

            /*O objeto String possui o método equalsIgnoreCase irá pegar uma letra
             *e comparar com outra, retornando true caso seja igual, e retornará
             * false caso seja diferente, independente se a letra digitada seja
             * maiúscula ou minúscula*/
            if ( ! (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") ) ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            //incremennto do contador
            count++;

        }while(count < consoantes.length);
        //O laço se repete enquanto o contador for menor que o tamanho da array consoantes

        System.out.println("Consoantes: ");
        //Cria for-each
        for( String consoante : consoantes ){

            if (consoante != null)

                //Ler variável de iteração do for-each consoante
               System.out.println(consoante + " ");

        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println("length: " + consoantes.length);

    }
}