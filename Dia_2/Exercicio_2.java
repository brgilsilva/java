import java.util.Scanner;

public class Exercicio_2 {
    //Escreva um algoritmo em Java, que leia um número inteiro via teclado
    // e mostre na tela uma mensagem indicando se este número é par ou ímpar
    // e se o número é positivo ou negativo.


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num, rest;

        System.out.println("Digite um número inteiro:");
        num = ler.nextInt();

        rest = num%2;

        if(num>0 && rest==0) {
            System.out.println("O número " + num + " é POSITIVO e PAR");
        }
        else if (num>0 && rest !=0) {
            System.out.println("O número " + num + " é POSITIVO e IMPAR");
        }
        else if(num<0 && rest==0) {
            System.out.println("O número " + num + " é NEGATIVO e PAR");
        }
        else{
            System.out.println("O número " + num + " é NEGATIVO e IMPAR");
        }

    }
}

