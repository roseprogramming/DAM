package PROGRAMACION.entradaTexto;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String texto;
        Scanner scn= new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        texto= scn.nextLine();

        System.out.println("Bienvenido: "+texto);
        scn.close();
        String ejemplo = "Hola";
        char caracter = ejemplo.charAt(2);
        System.out.println(caracter);






    }

}
