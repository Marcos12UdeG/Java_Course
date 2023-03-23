package org.marcos.section2;

import javax.swing.*;

public class VentanasDeDialogo {

    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog(null,"DAME UN NUMERO");
        int numeroDecimal=0;
        try
        {
            numeroDecimal = Integer.parseInt(numero);
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"INGRESAR UN NUMERO VALIDO");
            main(args);
            System.exit(0);
        }
        String mensajeOctal = ("numeroOctal de " + numeroDecimal+ " es "+Integer.toOctalString(numeroDecimal));
        System.out.println(mensajeOctal);
        String mensajeHexa = ("\nnumeroHexadecimal de " + numeroDecimal+ " es "+Integer.toHexString(numeroDecimal));
        System.out.println(mensajeHexa);

        String mensaje = mensajeOctal;
        mensaje += mensajeHexa;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
