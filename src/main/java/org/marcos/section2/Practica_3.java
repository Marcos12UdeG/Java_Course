package org.marcos.section2;

public class Practica_3 {
    public static void main(String[] args) {
        String uno = "marcos";
        String dos = "angela";
        String tres = "israel";

        String l = uno.substring(uno.length()-2);
        System.out.println("l = " + l);

        Character letra = uno.charAt(1);
        Character mayu = Character.toUpperCase(letra);

        String a = dos.substring(uno.length()-2);
        System.out.println("l = " + a);

        Character le = dos.charAt(1);
        Character ma = Character.toUpperCase(le);

        String i = tres.substring(uno.length()-2);
        System.out.println("l = " + i);

        Character let = tres.charAt(1);
        Character may = Character.toUpperCase(let);

        System.out.println(mayu+"."+l+"_"+ma+"."+a+"_"+may+"."+i);


    }
}
