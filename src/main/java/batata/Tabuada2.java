package batata;

import java.util.Scanner;

public class Tabuada2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++ ) {
            for (int contador = 0; contador <= 10; contador++){
                System.out.print(multiplicador * contador);
                System.out.println(" ");

            }
            System.out.println();

        }
    }
}
