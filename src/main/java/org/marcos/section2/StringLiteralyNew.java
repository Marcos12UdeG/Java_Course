package org.marcos.section2;

public class StringLiteralyNew
{
    public static void main(String[] args) {
        String curso = "PROGRAMACION JAVA";
        String curse= new String("PROGRAMACION JAVA");

        System.out.println("curse = " + curse);
        System.out.println("curso = " + curso);

        boolean esIgual = curso == curse;
        esIgual = curso.equals(curse);
        System.out.println("esIgual = " + esIgual);

    }
}
