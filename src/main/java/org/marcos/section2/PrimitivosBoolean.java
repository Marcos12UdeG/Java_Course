package org.marcos.section2;

public class PrimitivosBoolean {
    public static void main(String[] args)
    {
        boolean bol = Boolean.TRUE;

        System.out.println("bol = " + bol);

        double d = 98765.43e-3;
        float f = 12345e2F;

        System.out.println("d = " + d);
        System.out.println("f = " + f);

        bol = f > d;
        System.out.println("bol = " + bol);

        boolean dato = 3+2 == 1;

        System.out.println("dato = " + dato);
    }
}
