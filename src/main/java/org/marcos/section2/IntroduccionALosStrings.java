package org.marcos.section2;

public class IntroduccionALosStrings {
    public static void main(String[] args)
    {
        String nombre = "MARCOS";
        String apellido = "marcos";

        System.out.println("MI NOMBRE ES : "+nombre+" "+apellido);

        if(nombre.equals(apellido))
        {
            System.out.println("IGUALES");
        }
        else{
            System.out.println("DESIGUALES");
        }

        System.out.println(nombre.equalsIgnoreCase(apellido));

        System.out.println(nombre.charAt(2));
        System.out.println(nombre.startsWith("M"));
    }
}
