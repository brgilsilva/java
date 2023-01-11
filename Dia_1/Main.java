package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ler = new Scanner(System.in);
        float salario, abono;

        System.out.println("Digite o Salário: ");
        salario = ler.nextFloat();
        System.out.println("Digite o Abono: ");
        abono = ler.nextFloat();

        System.out.println("Novo Salário é: " + (salario + abono));
    }
}
