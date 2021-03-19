package pl.patrykk;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int suma=0;
        int i=0;

        while (i<100){
            suma = suma + (random.nextInt(100 / 2)*2) + 2;
            i++;

        }


        System.out.println(suma);

    }
}

