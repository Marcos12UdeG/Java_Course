package org.marcos.section2;

public class ValidarString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
        if (esNulo) {
            System.out.println(curso);
        }
        System.out.println("BIENVENIDO AL CURSO "+curso);

        String h = "hola";

        int esVacio = h.length();

        if(esVacio == 4)
        {
            System.out.println("LA LONGITUD DEL STRING ES "+ h.length());
        }

    }
}
