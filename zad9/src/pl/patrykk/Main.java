package pl.patrykk;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int suma=0;

        for (int i = 0; i < 100; i++){
            suma = suma + (random.nextInt(100 / 2)*2) + 2;
        }


            System.out.println(suma);

    }
}
