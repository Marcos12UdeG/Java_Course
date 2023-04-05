package org.marcos.section2;

public class ExtensionDeUnArchivo {

    public static void main(String[] args) {
        String extension = "aluna_imagen.pdf";
        int i = extension.indexOf(".");
        System.out.println("extension = " + extension.length());
        System.out.println("extension.substring(extension.length()-3) = " + extension.substring(extension.length()-3));
        System.out.println("extension = " + extension.substring(i+1));

    }
}
