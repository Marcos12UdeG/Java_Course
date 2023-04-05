package org.marcos.section2;

public class MetodosString {
    public static void main(String[] args) {

        String nombre = "MARCOS";

        System.out.println("nombre = " + nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"MARCOS\") = " + nombre.equals("MARCOS"));
        System.out.println("nombre.equals(\"marcos\") = " + nombre.equals("marcos"));
        System.out.println("nombre.equalsIgnoreCase(\"marcos\") = " + nombre.equalsIgnoreCase("marcos"));
        System.out.println("nombre.compareTo(\"MARCOS\") = " + nombre.compareTo("MARCOS"));
        System.out.println("nombre.compareTo(\"angela\") = " + nombre.compareTo("angela"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(4));

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.toUpperCase() = " + trabalenguas.toUpperCase());
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"r\") = " + trabalenguas.indexOf("r"));
        System.out.println("trabalenguas.lastIndexOf(\"a\")); = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains('a') = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));

        

    }}
