package com.company;

import java.util.Scanner;

public class exercicio_3 {
    //Elabore um algoritmo que leia o Salário Bruto,
    // o Adicional Noturno, as Horas Extras e os Descontos
    // de um Colaborador, em variáveis do tipo float e exiba
    // na tela o Salário Líquido.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float adNoturno, salarioB, hExtra, desconto, total;
        System.out.println("Digite o salário Bruto: ");
        salarioB = ler.nextFloat();
        System.out.println("Digite o adicional noturno: ");
        adNoturno = ler.nextFloat();
        System.out.println("Digite as horas extras: ");
        hExtra = ler.nextFloat();
        System.out.println("Digite o desconto: ");
        desconto = ler.nextFloat();

        total = salarioB + adNoturno + hExtra*5 - desconto;

        System.out.println("O Salário liquido é de: " + total);
    }
}
