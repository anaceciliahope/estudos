package atividades;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
        int idade = teclado.nextInt();
         if (idade >= 18){
             System.out.println("Você é maior e pode entrar");
         }
         else {
             System.out.println("Você não é maior, não pode entrar");
         }
    }
}
