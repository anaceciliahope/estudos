package batata;

import java.util.Scanner;

public class Linhas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int linhas = 0; linhas < 5; linhas++) {
            for (int colunas = 0; colunas < 5; colunas++) {
                if (colunas > linhas) {
                    break;

                } System.out.print(colunas+1);


            }
            System.out.println();




        }
    }
}
