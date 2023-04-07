package org.marcos.section2;

import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INGRESAR LA CAPACIDAD ACTUAL DEL TANQUE");
        int gasolina = s.nextInt();


        if(gasolina == 70)
        {
            System.out.println("ESTA LLENO");
        }else if(gasolina > 59 && gasolina <70)
        {
            System.out.println("ESTANQUE CASI LLENO");
        }else if(gasolina >39 && gasolina <60)
        {
            System.out.println("ESTANQUE 3/4");
        }else if(gasolina >34 && gasolina <40)
        {
            System.out.println("MEDIO ESTANQUE");
        }else if(gasolina >19 && gasolina <35)
        {
            System.out.println("SUFICIENTE");
        } else if (gasolina>0 && gasolina<20) {
            System.out.println("INSUFICIENTE");
        }

    }
}
