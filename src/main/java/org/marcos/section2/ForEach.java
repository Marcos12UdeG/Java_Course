package org.marcos.section2;

public class ForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,11,13};

        for(int num : numeros)
        {
            System.out.println("num = " + num);
        }

        String[] nombres = {"MARCOS","ANGELA","XIMENA"};
        for(String nom : nombres)
        {
            System.out.println("nom = " + nom);
        }
    }
}
