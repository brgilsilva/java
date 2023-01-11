
import java.util.Scanner;
//Faça um algoritmo em Java que leia 3 valores int A, B e C
// e imprima na tela se a soma de A + B é maior, menor ou igual a C.

public class Exercicio_1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int a,b,c;

        System.out.println("Digite o valor A: ");
        a = ler.nextInt();

        System.out.println("Digite o valor B: ");
        b = ler.nextInt();

        System.out.println("Digite o valor C: ");
        c = ler.nextInt();

        if (a+b > c) {
            System.out.println("A soma de "+a+" + "+b+" é "+(a+b)+" e maior que "+c);


        } else if (a+b < c) {
            System.out.println("A soma de "+a+" + "+b+" é "+(a+b)+" e menor que "+c);
        } else {
            System.out.println("A soma de "+a+" + "+b+" é "+(a+b)+" e igual a "+c);
        }

    }
}

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

import java.sql.SQLOutput;
        import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {

        //Com base na tabela abaixo, escreva um algoritmo em Java que leia o código
        // de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).
        // A seguir, mostre na tela o valor total da conta e nome do produto que foi comprado.

        int opcao, qtd;
        Scanner leia = new Scanner(System.in);

        System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para Cachorro-quente");
        System.out.println("--Digite 2 para X-Salada --");
        System.out.println("--Digite 3 para X-Bacon --");
        System.out.println("--Digite 4 para Bauru --");
        System.out.println("--Digite 5 para Refrigerante --");
        System.out.println("--Digite 6 para Suco de laranja --");
        opcao = leia.nextInt();
        System.out.println("Digite a Quantidade desejada");
        qtd = leia.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nVocê selecionou "+qtd+" Cachorro-Quente no valor de R$10,00 cada, ficando um total de R$"+(qtd*10));

                break;
            case 2:
                System.out.println("\nVocê selecionou"+qtd+" X-Salada no valor de R$15,00 cada, ficando um total de R$"+(qtd*15));
                break;
            case 3:
                System.out.println("\nVocê selecionou "+qtd+" X-Bacon no valor de R$18,00 cada, ficando um total de R$"+(qtd*18));
                break;
            case 4:
                System.out.println("\nVocê selecionou "+qtd+" Bauru no valor de R$12,00 cada, ficando um total de R$"+(qtd*12));
                break;
            case 5:
                System.out.println("\nVocê selecionou "+qtd+" Refrigerante no valor de R$8,00 cada, ficando um total de R$"+qtd*8);
                break;
            case 6:
                System.out.println("\n Você selecionou "+qtd+" Suco no valor de R$13,00 cada, ficando um total de R$"+qtd*13);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}