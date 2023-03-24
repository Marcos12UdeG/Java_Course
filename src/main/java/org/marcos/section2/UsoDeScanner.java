package org.marcos.section2;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsoDeScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("INGRESAR UN NUMERO");
        int numero=0;
        try
        {
            numero = entrada.nextInt();
        }catch(InputMismatchException e){
            System.out.println("INGRESAR UN NUMERO VALIDO");
            main(args);
            System.exit(0);
        }
        System.out.println("numero = " + numero);
        String numeroBinary = ("Integer.toBinaryString(numero) = " + Integer.toBinaryString(numero));
        String numeroOcta = ("\nInteger.toOctalString(numero) = " + Integer.toOctalString(numero));
        String numeroHexa = ("\nInteger.toHexString(numero) = " + Integer.toHexString(numero));

        String mensaje = numeroBinary;
        mensaje += numeroOcta;
        mensaje += numeroHexa;

        System.out.println(mensaje);
    }
}