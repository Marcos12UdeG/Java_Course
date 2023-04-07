package org.marcos.section2;

import java.util.Scanner;

public class LoginTernario
{
    public static void main(String[] args) {

        String [] usernames = {"MARCOS","ANGELA"};
        String [] passwords = {"123","1234"};

        Scanner s = new Scanner(System.in);

        System.out.println("INGRESAR NOMBRE DE USUARIO");
        String p = s.next();
        System.out.println("INGRESAR PASSWORD");
        String u = s.next();

        boolean autenticado = false;
        for(int i =0; i< usernames.length;i++)
        {
             autenticado =  (usernames[i].equalsIgnoreCase(p) && passwords[i].equalsIgnoreCase(u)) ? true : autenticado;

        }

        String mensaje = autenticado ? "BIENVENIDO ".concat(p).concat("!"):"USUARIO NO ENCONTRADO";
        System.out.println("mensaje = " + mensaje.toUpperCase());




    }
}
