package org.example;
/*Desenvolva um gerdor de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 *
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 * */


import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);/* Captura daddos digitados no teclado.*/

        /*Variáveis*/

        System.out.println("Digite número que deseja ver a  tabuada: ");// mensagem para pedir para usuario o que digitar.
        int tabuada = scan.nextInt();/*Número do qual o usuário quer vera tabuada*/
        System.out.println("Tabuada de " + tabuada + " é : \n" );


        /*Agora queremos ver a tabuada de um número, a tabuada do número 5
        *por exemplo. Queremos que a tabuada de 5 comece em 5 x 1 até 5 x 10.
        * Para fazer isso o programa terá que estar se  repetindo,
        * ele fará 5 x 1 , volta de novo fará 5 x 2, e assim sucessivamente
        * até chegar em 5 x 10.
        * Após fazer por dez vezes o programa finalizará. */

        /*Vamos fazer isso acontecer utilizando o looping for,
        *o looping for tem a seguinte estrutura:
        *
        * for( ; ; ) {
        *
        * }
        *
        * Vamos imaginar que o laço for é um laço while só que comprimido,
        * se colocarmos na primeira parte do for que fica ente o parêntesis
        * e o primeiro ponto-e-virgula que será for (int = i; ; ),
        * se olharmos direito, veremos essa primeira tem uma analogia parecida
        * com o contador do looping while  que começa com 0 e depois é acrescentado
        * mais 1, no looping while a variável do contador teve nome de count
        * enquanto essa varável teve o nome de i, e ela não foi iniciada com zero
        *  pois a tabuada se inicia a partir de 1, logo o contador teá que iniciar
        * em 1 e não em 0.
        *
        * E na segunda parte dentro do segundo ponto-e-virgula
        *  colocamos uma condição dentro for especificando até
        * que ponto esse looping deverá se repetir e nesse caso queremos que se
        * repita até quando a variável i (que é o contador) for igual a 10, então
        * colocamos for(int i= 1; i<=10; ).
        *
        * E na terceira parte, assim como no acrescentamos mais 1 a variavél
        * contador, para termos um controle de fluxo, ficando então
        * for(int i ; i<= 10; i++). Podemos também substituir esse i++
        * por i = i + 1.
        * */

        for (int i = 1; i <= 10; i = i + 1) {

            /*Queremos a tabuada de um número especificado pelo usuário
            * multiplicado por um número que vai ser modificando de 1 até 10,
            * e que mostre o resultado. */

            /*temos a variável tabuada concatenado com a string X que irá ilustrar
            * o sinal de vezes, concatenado a variável contador i, a qual vai se
            * modificando enquanto o looping está sendo executado, ela vai começar
            * com 1, como foi concatenado com tabuada (numero digitado) e será
            * multiplicado pela váriavel contador i, que iniciará em 1, depois de
            * fazer a multiplicação e o resultado ele voltará de novo acrescentará
            * mais 1 a varável contador i, e ela passará a ser 2, em seguida ele irá
            * fazer a multiplicação do número digitado mais esse número da váriável
            * contador i*/
            System.out.println(tabuada + " X " + i + " = " + (tabuada *  i));

        }
    }
}