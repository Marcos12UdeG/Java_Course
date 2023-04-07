package org.marcos.section2;

import javax.swing.*;
public class Tarea6 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,"INGRESAR NOMBRE");
        String apellido = JOptionPane.showInputDialog(null,"INGRESAR APELLIDO");
        String conca = nombre.concat(" ").concat(apellido);
        int num1 = conca.length();

        String nombre1 = JOptionPane.showInputDialog(null,"INGRESAR NOMBRE");
        String apellido1 = JOptionPane.showInputDialog(null,"INGRESAR APELLIDO");
        String con = nombre1.concat(" ").concat(apellido1);
        int num = con.length();

        String nombre2 = JOptionPane.showInputDialog(null,"INGRESAR NOMBRE");
        String apellido2 = JOptionPane.showInputDialog(null,"INGRESAR APELLIDO");
        String c = nombre2.concat(" ").concat(apellido2);
        int num2 = c.length();

        if(num1 > num && num1 > num2)
        {
            JOptionPane.showMessageDialog(null,conca);
        }else if(num > num1 && num > num2)
        {
            JOptionPane.showMessageDialog(null,con);
        }else{
            JOptionPane.showMessageDialog(null,c);
        }
    }
}
