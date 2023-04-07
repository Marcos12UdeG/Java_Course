package org.marcos.section2;

import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args)
    {
        Scanner s =  new Scanner(System.in);

        System.out.println("INGRESAR 1ER NUMERO");
        int numero1 = s.nextInt();
        System.out.println("INGRESAR 2DO NUMERO");
        int numero2 = s.nextInt();

        String max = (numero1 > numero2) ? + numero1 + "\n" + numero2 : + numero2+ "\n" +numero1;
        System.out.println("Mayor a Menor\n"+max);
    }
}
