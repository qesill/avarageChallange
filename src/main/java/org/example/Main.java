package org.example;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException
    {
        /*
        1.  Oblicz średnią z następujących liczb: 1, 2, 3, 4
            Pamiętaj o użyciu nawiasów aby operacje matematyczne
            był prawidłowe.
            Upewnij się, że dzielicz przez liczbę zmiennoprzecinkową.
            Zaprezentuj wynik użytkownikowi

        2.  Zaprezentuj efekt inkrementacji i dekrementacji
            obliczonej wcześniej średniej
         */
        int arr [] = {1,2,3,4};
        float sum = 0f;
                        for (int counter = 1; arr.length >= counter; counter++)
        {
            sum += arr[counter-1];
        }
                         float avarage = sum/ arr.length;
        System.out.println("Średnia: " + avarage);
        float avarageInc = ++avarage;
        float avarageDec = --avarage;
        System.out.println("Efekt inkrementacji: " + avarageInc);
        System.out.println("Efekt dekrementacji: " + avarageDec);
    }


}