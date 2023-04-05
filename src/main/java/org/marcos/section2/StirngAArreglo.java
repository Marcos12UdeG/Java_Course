package org.marcos.section2;

public class StirngAArreglo {
    public static void main(String[] args)
    {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        for(int i=0;i<largo;i++)
        {
            System.out.print(arreglo[i]);
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String[] hola = trabalenguas.split("a");
        int l = hola.length;
        for(int i=0;i<l;i++)
        {
            System.out.println("hola = " + hola[i]);
        }

        System.out.println(arreglo);


    }
}
