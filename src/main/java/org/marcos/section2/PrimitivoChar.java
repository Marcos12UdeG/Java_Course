package org.marcos.section2;

public class PrimitivoChar {
    public static void main(String[] args)
    {
        char caracter = '\u0040';
        char decimal = 64;
        char arroba = '@';

        System.out.println("arroba = " + arroba);
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);

        System.out.println("decimal = caracter: " + (decimal == caracter));
        System.out.println("(arroba == decimal && arroba == caracter = " + (arroba == decimal && arroba != caracter));
        System.out.println("\n");
        System.out.println("caracter en bytes es = " + Character.BYTES);
        System.out.println("caracter en bits es = " + Character.SIZE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);

    }
}
