package org.marcos.section2;

public class InstanceOf {
    public static void main(String[] args) {

        String texto = "CREANDO UN OBJETO";
        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("b1 es de tipo String ? = " + b1);

        b1 = texto instanceof Object;
        System.out.println("b1 es de tipo Object ? = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es de tipo Integer ? = " + b1);

        Double decimal = 87.56;

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo number = " + b1);
    }
}
