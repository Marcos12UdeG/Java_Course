package org.marcos.section2;

import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        int menor = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = s.nextInt();
            numeros[i] = numero;
        }

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("menor = " + menor);
        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }
        }
    }

