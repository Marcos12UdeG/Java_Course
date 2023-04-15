package org.marcos.section2;

import java.util.Scanner;

public class Tarea9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scan.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        int num2 = scan.nextInt();

        int producto = 0;
        int valorAbsA = (num1 > 0) ? num1 : -num1;

        for (int i = 0; i < valorAbsA; i++) {
            producto += num2;
        }
        if (((num1 < 0) && (num2 < 0)) || (num1 < 0)) {
            producto = -producto;
        }
        System.out.println("El resultado de la multiplicación es = " + producto);
    }
}
