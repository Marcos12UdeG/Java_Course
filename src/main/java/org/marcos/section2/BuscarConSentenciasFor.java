package org.marcos.section2;

public class BuscarConSentenciasFor {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragaban trigo en un trigal";
        int cantidad = 0;

        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length();

        bucle1:
        for(int i =0;i<maxFrase;i++)
        {
            int k = i;
            for(int j = 0;j< maxPalabra;j++)
            {
           if(frase.charAt(k++) != palabra.charAt(j))
           {
               i++;
               continue bucle1;
           }}
           cantidad++;
            i= i+maxPalabra;
        }
        System.out.println("Encontrado "+cantidad+ " veces la palabra " +palabra);


    }
}
