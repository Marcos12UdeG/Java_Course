package org.marcos.section2;

public class sistemasNumericos {
    public static void main(String[] args)
    {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numeroBinario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal));
        System.out.println("numeroOctal de " + numeroDecimal + " = " +Integer.toOctalString(numeroDecimal));
        System.out.println("numeroHexadecimal de " + numeroDecimal + " = " +Integer.toHexString(numeroDecimal));

        int binario = 0B111110100;
        int octal = 0764;
        int hex = 0x1f4;
        System.out.println("octal = " + octal);
        System.out.println("hex = " + hex);
        System.out.println("binario = " + binario);
    }
}
