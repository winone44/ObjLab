package pl.patrykk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int rok = scanner.nextInt();

        if (rok%4 == 0 && (rok%100 != 0 || rok%400 == 0)){

            System.out.println("Rok " + rok + " jest przestępny");

        }else {

            System.out.println("Rok " + rok + " nie jest przestępny");

        }


    }
}
