package org.marcos.section2;

public class ConversionDe {
    public static void main(String[] args) {
        int nume = 50;
        String numeroStr = Integer.toString(nume);

        System.out.println("numeroStr = " + numeroStr);

        String numero = String.valueOf(nume);
        boolean bandera = true;

        String.valueOf(bandera);

        System.out.println("bandera = " + bandera);
        System.out.println("numero = " + numero);
    }
}
