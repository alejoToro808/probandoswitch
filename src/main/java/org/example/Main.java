package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //DECLARANDO VARIABLES

        double temperaturaAmbiente;

        //PROCESO

        System.out.print("Cual es la temperatura ambiente actual: ");
        temperaturaAmbiente = teclado.nextDouble();

        if (temperaturaAmbiente==30.0) {
            temperaturaAmbiente=20.0;

        } else if (temperaturaAmbiente==20.0) {
            temperaturaAmbiente=25.0;

        }else if (temperaturaAmbiente==40.0) {
            temperaturaAmbiente=20.0;
        }


    }
}