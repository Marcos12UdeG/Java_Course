package org.marcos.section2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperadoresLogicos {
   public static void main(String[] args)
   {
       String nombre = "MARCOS";
       String codigo = "1234";

       String nombre2 = "ANGELA";
       String codigo2 = "1234";


       Scanner entrada = new Scanner(System.in);

       System.out.println("INGRESAR USUARIO");
       String u = entrada.next();
       System.out.println("INGRESAR PASSWORD");
       String p = entrada.next();


       if( codigo.equals(p) && nombre.equalsIgnoreCase(u) || codigo2.equals(p) && nombre2.equalsIgnoreCase(u))
       {
           System.out.println("BIENVENIDO "+u.concat(" TU CODIGO ES ")+p);
       }
       else
       {
           System.out.println("INGRESE LOS VALORES CORRECTOS");
       }
   }
}
