package org.marcos.section2;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        int max =0;

        Scanner s = new Scanner(System.in);
        System.out.println("INGRESAR 1ER NUMERO");
        int num1 = s.nextInt();
        System.out.println("INGRESAR 2DO NUMERO");
        int num2 = s.nextInt();
        System.out.println("INGRESAR 3ER NUMERO");
        int num3 = s.nextInt();

        max = num1 > num2? num1 : num2;
        max = max > num3? max : num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("max = " + max);
    }


}
