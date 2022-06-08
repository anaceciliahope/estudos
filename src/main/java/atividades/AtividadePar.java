package atividades;

import java.util.Scanner;

public class AtividadePar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o número: ");
        int numero = teclado.nextInt();
        int contador = 0;
        while (contador <= numero){

            if (contador % 2 == 0){
                System.out.println(contador);

            }
            contador++;

        }
    }
}
