package pl.patrykk;

public class Main {

    public static void main(String[] args) {
        int dane[] = new int[10];


        for (int i = 0; i < dane.length; i++){
            dane[i] = dane.length - i-1;
        }

        for (int i = 0; i < dane.length; i++){
            System.out.print(dane[i]);

        }
    }
}
