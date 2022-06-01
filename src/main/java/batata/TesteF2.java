package batata;

import java.util.Scanner;

public class TesteF2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Contar até quanto: ");
        int valor = teclado.nextInt();
        for (int contador = 0 ;contador <= valor ;contador++) {
            System.out.println(contador);

        }
    }
}
