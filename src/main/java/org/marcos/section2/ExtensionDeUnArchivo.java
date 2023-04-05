package org.marcos.section2;

public class ExtensionDeUnArchivo {
    public static void main(String[] args) {
      String extension = "algo.jpeg";
        int i = extension.lastIndexOf(".");//retorna la posicion del char;
        System.out.println("extension.length() = " + extension.length());
        System.out.println("extension.substring(extension.length()-3) = " + extension.substring(extension.length()-3));
        System.out.println("extension = " + extension.substring(i+1));//extrae caracteres;
    }
}
