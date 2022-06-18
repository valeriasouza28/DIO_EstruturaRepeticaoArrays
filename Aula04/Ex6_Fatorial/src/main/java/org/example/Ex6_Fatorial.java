package org.example;

import java.util.Scanner;

/*faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!= 120 .*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        /*Fatorial é quando pegamos um número e decompomos ele
        *multiplicando por exemplo:
        *5 x 4, x 3, x 2, x 1
        */

        /*Pegamos dados digitados no teclado*/
        Scanner scan = new Scanner(System.in);


        /*Variáveis*/

        System.out.println("Fatorial: "); /*Para pedir o número que o usuário deseja o fatorial.*/
        int fatorial = scan.nextInt();/* pegar o número do fatorial digitado pelo usuário*/

        /*A variavel multiplicacao recebeu 1 porque se iniciado com zero toda multiplicação
        * feita com zero sempre daria zero a cada repetição*/
        int multiplicacao = 1;

        /* Vamos fazer uso do for */

        /* O meu i que é a variável contador ele vai começar recebendo valor
        *da varável fatorial então na primeira parte do for colocamos
        * for( int i =  fatorial; ; )
        * E na segunda parte do for looping irei colocar até quando o laço vai
        * ser repetido, ele vai ser repetido até quando a minha variavel contador i,
        * ela terá que ser maior ou igual 1, eu ainda vou querer esse valor porque
        * ele vai estar dentro valor fatorial (x 1), mas quando esse valor for
        * 0, que é menor do que um, vai invalidar ess for looping ele vai parar o
        * programa.
        *
        * Como vamos fazer para que o valor de i a variável contador, vá se modificando,
        * passando a ter valor 4, depois 3, depois 2, depois 1?
        * Colocando na terceira parte do for looping for (int i = fatorial; i >= 1; i = i - 1)
        * porque a cada looping terá que diminuir um valor, por isso será utilizado  um
        * decremento.*/


        System.out.print(fatorial + "!= ");
        for (int i = fatorial; i >= 1; i = i - 1){

            /*A variável multiplicaçao recebeu ela mesma multiplicado pela variável contador i,
            * porque a variável i reberá o número que ficará mudadndo no decorrer do laço*/
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao); /*Irá exibir o resultado final atribuido a variável
                                            *multilicacao em multiplicacao = multiplicacao * i;
                                            * exibindo então seu fatorial*/

        /*Debbug
        *
        * Na linha 47 onde inicia a estrutura do for looping, cliqque no canto próximo
        * a numeração da linha, e presssione no teclado 'shift f9' e será ativado o modo Debbug
        *
        * Na parte onde ficaria o terminal que agora é o Console digite 3 para que seja feito
        * o fatorial de 3, percceba que na linha 47 aparece a mensagem "fatorial de 3",
        * clicamos na seta para baixo ao lado da seta dobrada para baixo, e ele vai
        * entrar no programa, vai fazer a multiplicação versus o i, e o i vale 3,
        * e vai ficar 3 vezes 1, e o valor da multiplicação vai valer 3, pressione novamente
        * a seta para baixo ao lado da seta dobrada, e irá aparecer uma mensagem na
        *  linha 51 "multiplicacao : 1    i : 3".
        *
        * Pressione a mesma seta para baixo novamente, ele vai entrar no looping for novamente,
        * pressione a seta, no novamente e ele irá fazer a multiplicaçao de 3 vezes 2,
        * pressione a tecla novamente, e perceba que o estará valendo 2 , porque ele ele está
        * diminuindo.
        *
        * Pressione a seta para baixo novamente, e o i passará a ser 1, pressione a seta novamente,
        * ele irá encerrar e imprimir o fatorial do número digitado, e uma mensagem na linha 55
        * dizendo que o fatorial é 6 " multiplicaçao : 6 " */


    }
}