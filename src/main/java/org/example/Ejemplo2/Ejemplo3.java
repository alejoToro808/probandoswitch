package org.example.Ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args){
        System.out.print("Digite la temperatura actual: ");
        Scanner teclado=new Scanner(System.in);
        Double temperatureAmbiente=teclado.nextDouble();
        String temperaturaComoTexto=temperatureAmbiente.toString();



        switch (temperaturaComoTexto){
            case "20.0":
                temperatureAmbiente=25.0;
                break;

            case "30.0":
                temperatureAmbiente=20.0;
                break;

            case "40.0":
                temperatureAmbiente=20.0;
                System.out.println("Se esta muriendo perro");
                break;
            default:
                System.out.println("El camino por defecto");
                System.out.println("No es ni 0, ni 10 ni 100");
                break;

        }



    }
}
