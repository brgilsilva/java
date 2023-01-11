package com.company;

import java.util.Scanner;

public class exercicio_2 {
    //Elabore um algoritmo que leia 4 notas de um participante,
    // em variáveis do tipo float e exiba na tela a média final do participante.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a nota 1: ");
        nota1 = ler.nextFloat();
        System.out.print("Digite a nota 2: ");
        nota2 = ler.nextFloat();
        System.out.print("Digite a nota 3: ");
        nota3 = ler.nextFloat();
        System.out.print("Digite a nota 4: ");
        nota4 = ler.nextFloat();

        System.out.println("A média do aluno é: "+((nota1+nota2+nota3+nota4)/4));
    }
}
