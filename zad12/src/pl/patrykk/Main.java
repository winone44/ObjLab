package pl.patrykk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a:");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b:");
        int b = scanner.nextInt();
        System.out.println("Podaj bok c:");
        int c = scanner.nextInt();

        boolean warunek1 = Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2);
        boolean warunek2 = Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2);
        boolean warunek3 = Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2);


        if (warunek1 || warunek2 || warunek3){

            System.out.println("To jest trójkąt prostokątny");

        } else {

            System.out.println("To nie jest trójkąt prostokątny");

        }
    }


}
