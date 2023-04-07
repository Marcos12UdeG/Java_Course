package org.marcos.section2;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        double mate =0.0;
        double espa =0.0;
        double ingles =0.0;

        System.out.println("INGRESAR CALIFICACION");
        mate = s.nextDouble();
        System.out.println("INGRESAR 2DA CALIFICACION");
        espa = s.nextDouble();
        System.out.println("INGRESAR 3ERA CALIFICACION");
        ingles = s.nextDouble();

        double promedio = (mate + espa + ingles)/3;

        String esta = promedio > 6 ? "APROBO EL EXAMEN ": "REPROBO EL EXAMEN";
        System.out.println("esta = " + esta);
    }
}
