package pl.patrykk;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int tablica[] = new int[100];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(20)+1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu od 1 do 20\na ja ją poszukam w 100 elemetowej tablicy:");
        int number = scanner.nextInt();
        int zlicz=0;


        for (int i = 0; i < tablica.length; i++) {
            if (number == tablica[i]){
                zlicz++;
            }

        }

        if (zlicz>0){
            System.out.println("Liczba: " + number + " Wystąpiła: " + zlicz);
        }else {
            System.out.println("Liczba: " + number + " nie wystąpiła w tablicy");
        }
    }
}
