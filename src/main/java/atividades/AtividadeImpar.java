package atividades;

import java.util.Scanner;

public class AtividadeImpar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = teclado .nextInt();
        int contador = 1;
        while (contador <= numero){
            if (contador % 2 == 1){
                System.out.println(contador);
            }
            contador++;

            }

    }
}
