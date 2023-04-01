package org.marcos.section2;

public class ConcatenandoStrings {
    public static void main(String[] args) {
        String curso = "PROGRAMACION";
        String profesor = "ANGELA";

        String detlle = ("LA PROFESORA "+profesor+ " IMPARTE LA CLASE DE "+curso);
        System.out.println(detlle);

        int numero = 10;
        int num = 5;

        System.out.println(detlle + " " +numero + num);

        String detalle2 = curso.concat(" ".concat(profesor));

        System.out.println(detalle2);



    }
}
