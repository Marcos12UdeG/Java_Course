package org.marcos.section2;

public class TestRendimiento
{
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = "a";

        StringBuilder sb = new StringBuilder(a);

        System.out.println("sb = " + sb);

        long inicio = System.currentTimeMillis();


        for(int i =0; i < 500; i++)
        {
            //c = c.concat(a).concat(b).concat("\n");
            c += a + b +"\n";
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);


    }
}
