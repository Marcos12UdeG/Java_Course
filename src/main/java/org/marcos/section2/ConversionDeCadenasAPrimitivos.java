package org.marcos.section2;

public class ConversionDeCadenasAPrimitivos
{
    public static void main(String[] args)
    {
        String numeroStr = "50";
        Integer.parseInt(numeroStr);
        System.out.println("numeroStr = " + numeroStr);

        String b = "5";
        Byte.parseByte(b);
        System.out.println("b = " + b);

        String logico = "true";
        boolean hola = Boolean.parseBoolean(logico);
        System.out.println("hola = " + hola);
    }
}
