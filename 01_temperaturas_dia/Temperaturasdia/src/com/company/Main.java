package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       final int HORAS = 24;
        double[] temperatura = new double[HORAS];

        for (int i = 0; i < HORAS; i++) {
            System.out.println("Escribe la temperatura: ");
            temperatura[i] = Double.parseDouble(br.readLine());

        }

        double total = 0;
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;

        for (int i = 0; i < HORAS; i++) {
            total += temperatura[i];

            if (temperatura[i] > max) ;
            max = temperatura[i];
            {
            if (temperatura[i] > min) ;

            min = temperatura[i];{
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(" ");

            for (int j = 0; j < temperatura; j++) {
                System.out.println("*");
            }
            System.out.println(" ");
            System.out.println(temperatura[i]);

        }

    }


}



