package org.marcos.section2;

import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {

        String[] nombres = {"MARCOS","ERIKA","PACO","ANGELA"};
        Scanner s = new Scanner(System.in);
        for(int i=0;i< nombres.length;i++)
        {
            if(nombres[i].toLowerCase().equals("ERIKA".toLowerCase()) ||
            nombres[i].toLowerCase().equals("PACO".toLowerCase()))
            continue;
            System.out.println(i+"-"+nombres[i]);

        }

        System.out.println("INGRESAR NOMBRE A BUSCAR");
        String nom = s.next();

        boolean encontrado = false;
        for(int i=0;i< nombres.length;i++)
        {
            if(nombres[i].equalsIgnoreCase(nom))
            {
                encontrado = true;
                break;
            }}
            if(encontrado)
            {
                System.out.println("BIENVENIDO ".concat(nom));
            }
            else
            {
                System.out.println("NO SE ENCONTRO");
            }

    }
}
