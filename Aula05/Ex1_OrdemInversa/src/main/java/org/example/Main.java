package org.example;

public class Main {
    public static void main(String[] args) {

        /*Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.*/

    /*    Arrays
  *Array ele um é um vetor, e ele pode ser do tipo de uma matriz unidimensiona porque só tem
  *uma linha e várias colunas, e tem também a array multidimensionai, e esses arrays multidimensionais
  *ele pode ter várias linhas e várias colunas
  */

  /*  Como vamos iniciar esse array?
  *em java primeiro declaramos o tipo dos elementos que vão conter dentro desse array,
  *e arrays armazena apenas elementos do mesmo tipo, como o exerciocio pede números inteiros,
  *criaremis uma array de números inteiros.*/

    /*int para declarar o tipo, para indicar que uma array usa colchete [],colocamos o
    *nome da array nesse caso o nome é vetor, para declarar os elementos abrimos
    *chaves {} e colocamos os elementos dentro dessa chave separando os elementos por
    *virgula */
        int[] vetor = {-5, 15, 50, 8, 4};

    /*Quando tentamos mostrar a variável vetor com a intenção de que mostre o conteúdo da
    array que está na varivel vetor, ao executar dessa maneira com Syste.ou.println(vetor);.
    Ele mostrará uma combinação de letras números e símbolos.
    Mas isso não é um erro está apenas apontando onde está o array na máquina. */


    /*Como vamos fazer para mostrar os elementos que tem dentro do vetor?

    É onde entra o laço de repetição, vamod criar um laço que a cada iteraçãiteraçãoo,
    no caso a cada looping que acontecer vamos andar dentro desse array para pegar cada elemento.
    O lenght é uma propriedade que retorna o tamanho da array .
    e no System. out.println (vetor[count]); O count é usado dentro do vetor para fazer a leitura e
    exibir a array. tiramos println e deixamos só print para que seja exibido na mesma linha ,
    mas dessa maneira irá ficar tudo junto, então é concatenado com uma string com um espaço, para que
    fique separado um elemento do outfrente,*/
        System.out.print("Vetor original: \n");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

    /*Mas como o exercício pede a ordem inversa do vetor, vamos fazer isso pegando os elementos
    do vetor de trás para frente. Vamos fazer issi criando outro laço, vamos utilizar o laço for.
    e i é uma variável contador, E esse -1 porque em arrays o tamanho da nossa array é 6,
    mas existem apenas 5 posições de elementos.
    Ele vai percorrer esse looping até que o i variável contador seja 0, poque como estando fazendo
    a ordem inversa 0 é a última posição do vetor de trás para frente.
    E o i-- é para decrementar, já que estamos utilizando em ordem decrescente*/

        System.out.print("\nVetor Inverso: \n");
        for(int i = (vetor.length - 1); i >= 0; i --){

            System.out.print(vetor[i] + " ");
        }
    }
}