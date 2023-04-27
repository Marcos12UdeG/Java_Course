package org.marcos.section2;

import javax.swing.*;


public class Tarea10 {
    public static void main(String[] args) {
        int numero;

        do {
            JOptionPane.showMessageDialog(null,"MENU"+"\n"+"1.- ACTUALIZAR"+"\n"+"2.- ELIMINAR"+"\n"+"3.- CREAR"+"\n"+"4.- LISTAR"+
                    "\n"+"5.- SALIR");
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESAR UNA OPCION"));

            switch (numero)
            {
                case 1:
                    JOptionPane.showMessageDialog(null,"ACTUALIZANDO SERVIDOR");
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"ELIMINANDO SERVIDOR");
                break;
                case 3:
                    JOptionPane.showMessageDialog(null,"CREANDO SERVIDOR");
                break;
                case 4:
                    JOptionPane.showMessageDialog(null,"LISTANDO SERVIDOR");
                break;
                case 5:
                    JOptionPane.showMessageDialog(null,"HASTA PRONTO");
                break;
            }

        }while(numero!=5);
    }
}
