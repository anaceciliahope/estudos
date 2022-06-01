package batata;

import java.util.Scanner;

public class TesteS {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o seu salário: ");

        float salario = teclado.nextFloat();
        if (salario <= 2800.0) {
            System.out.println("IR é de 7.5%");

        }

    }
}
