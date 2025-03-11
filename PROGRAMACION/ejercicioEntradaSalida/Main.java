package PROGRAMACION.ejercicioEntradaSalida;
import java.util.Scanner;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //calculadora mejorada:
        //pedir dos valores (a y b) y realizar las operaciones básicas que hemos visto
        int a;
        int b;
        Scanner scn = new Scanner(System.in);
        int suma;
        int resta;
        int multi;
        float divi;
        int resto;

        System.out.println("introduzca el valor de a");
        a = scn.nextInt();
        System.out.println("Introduzca el valor de b");
        b = scn.nextInt();

        suma = a + b;
        resta = a - b;
        multi = a * b;
        divi = (float) a / b;
        resto = a % b;

        //concatenar= unir texto con variables
        System.out.println("La suma de: "+a+" y "+b+" es: "+suma);
        System.out.println("La resta de: "+a+" y "+b+" es: "+resta);
        System.out.println("La multiplicación de: "+a+" y "+b+" es: "+multi);
        System.out.println("La división de: "+a+" y "+b+" es: "+divi);
        System.out.println("El resto de: "+a+" y "+b+" es: "+resto);
        scn.close();



    }
}
