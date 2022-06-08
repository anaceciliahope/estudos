package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double xA, xb, xC, yA, yB, yC;
        System.out.println("Enter the measures of triangle x: ");
        xA = teclado.nextDouble();
        xb = teclado.nextDouble();
        xC = teclado.nextDouble();
        System.out.println("Enter the measures of triangle y: ");
        yA = teclado.nextDouble();
        yB = teclado.nextDouble();
        yC = teclado.nextDouble();

        double p = (xA + xb + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xb) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.printf("Triangle x area: %.4f%n", areaX);
        System.out.printf("Triangle y area: %.4f%n", areaY);
        if (areaX > areaY){
            System.out.println("Larger area: x");
        }
        else {
            System.out.println("Larger area: y");
        }

    }
}

