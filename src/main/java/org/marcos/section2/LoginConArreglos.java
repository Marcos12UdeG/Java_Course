package org.marcos.section2;

import java.util.Scanner;

public class LoginConArreglos {
    public static void main(String[] args) {
        String usernames [] = new  String[2];
        String passwords [] = new  String[2];

        Scanner entrada = new Scanner(System.in);

        usernames [0] = "MARCOS";
        passwords [0] = "1234";

        usernames [1] = "ANGELA";
        passwords [1] = "1234";

        System.out.println("INGRESAR NOMBRE");
        String nom = entrada.next();
        System.out.println("INGRESAR PASSWORD");
        String pass = entrada.next();

        for(int i = 0;i< usernames.length;i++)
        {
            if(usernames[i].equals(nom) && passwords[i].equals(pass))
            {
                System.out.println("BIENVENIDO "+usernames[i]+" TU PASSWORD ES "+passwords[i]);
            }
        }

    }

}
