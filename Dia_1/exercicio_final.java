package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner ler = new Scanner(System.in);
        float salario, abono;

        System.out.println("Digite o Salário: ");
        salario = ler.nextFloat();
        System.out.println("Digite o abono: ");
        abono = ler.nextFloat();

        System.out.println("Novo Salário é: " + (salario + abono));
    }
}


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
