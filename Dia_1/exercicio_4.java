package com.company;

import java.util.Scanner;

public class exercicio_4 {
    //Leia quatro valores float (numero1, numero2, numero3 e numero4).
    // A seguir, calcule e mostre a diferença do produto entre o
    // numero1 e o numero2 pelo produto entre o numero3 e o numero4.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num1, num2, num3, num4;
        System.out.println("Digite o número 1: ");
        num1 = ler.nextFloat();
        System.out.println("Digite o número 2: ");
        num2 = ler.nextFloat();
        System.out.println("Digite o número 3: ");
        num3 = ler.nextFloat();
        System.out.println("Digite o número 4: ");
        num4 = ler.nextFloat();

        System.out.println("A diferença é de: " +((num1*num2)-(num3*num4)));
    }
}
