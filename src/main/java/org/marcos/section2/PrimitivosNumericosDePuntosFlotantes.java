package org.marcos.section2;

public class PrimitivosNumericosDePuntosFlotantes {
    public static void main(String[] args) {

        float real = 0.00000000015F;

        System.out.println("real = " + real);
        System.out.println("FLOTANTE CORRESPONDE EN BYTE A: "+Float.BYTES);
        System.out.println("FLOTANTE CORRESPONDE EN BITS A: "+Float.SIZE);
        System.out.println("MAX VALOR PARA FLOAT: "+Float.MAX_VALUE);
        System.out.println("MIN VALOR PARA FLOAT: "+Float.MIN_VALUE);
        System.out.println("\n");
        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("DOUBLE CORRESPONDE EN BYTE A: "+Double.BYTES);
        System.out.println("DOUBLE CORRESPONDE EN BITS A: "+Double.SIZE);
        System.out.println("MAX VALOR PARA DOUBLE: "+Double.MAX_VALUE);
        System.out.println("MIN VALOR PARA DOUBLE: "+Double.MIN_VALUE);

        float Flotante = 3.1416F;
        System.out.println("Flotante = " + Flotante);
    }
}
