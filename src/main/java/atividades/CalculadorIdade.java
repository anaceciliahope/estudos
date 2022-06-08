package atividades;

import java.util.Scanner;

public class CalculadorIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe ano atual: ");
        int anoAtual = teclado.nextInt();
        System.out.print("Informe ano do nascimento: ");
        int anoNascimento = teclado.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println(idade);

    }
}
