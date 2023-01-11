
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

