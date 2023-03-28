package org.marcos.section2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int op;

        String nombre="";
        int folio=0;
        String dueno ="";
        String direccion="";


        do {
            System.out.println("MENU");
            System.out.println("1.- CAPTURAR");
            System.out.println("2.- MOSTRAR FACTURA");
            System.out.println("3.- BUSCAR FACTURA POR NOMBRE");
            op = entrada.nextInt();

            switch(op)
            {
                case 1:
                {
                    System.out.println("INGRESAR NOMBRE");
                    nombre = entrada.next();
                    System.out.println("INGRESAR NOMBRE DEL DUENO");
                    dueno = entrada.next();
                    System.out.println("INGRESAR DIRECCION");
                    direccion = entrada.next();
                    System.out.println("INGRESAR FOLIO");
                    try
                    {
                        folio = entrada.nextInt();
                    }catch(InputMismatchException e)
                    {
                        System.out.println("INGRESAR UN NUMERO VALIDO");
                        main(args);
                        System.exit(0);
                    }

                    break;
                }
                case 2:
                {
                    System.out.println("nombre = " + nombre);
                    System.out.println("dueno = " + dueno);
                    System.out.println("folio = " + folio);
                    System.out.println("direccion = " + direccion);
                    break;
                }

                case 3:
                {
                    String NB = "";
                    System.out.println("DAME EL NOMBRE A BUSCAR");
                    NB = entrada.next();

                    int value = nombre.compareTo(NB);

                    if(value == 0)
                    {
                        System.out.println("SE ENCONTRO EL REGISTRO");
                        System.out.println("nombre = " + nombre);
                        System.out.println("dueno = " + dueno);
                        System.out.println("folio = " + folio);
                        System.out.println("direccion = " + direccion);

                    }

                    else
                    {
                        System.out.println("NO SE ENCONTRO EL REGISTRO");
                    }
                    break;

                }

            }

        }while(op !=4);

    }
}
