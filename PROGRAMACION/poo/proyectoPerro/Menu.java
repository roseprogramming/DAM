package PROGRAMACION.poo.proyectoPerro;

import java.util.Scanner;

public class Menu {
    public static int menu(Scanner lector){
        System.out.println("1. Crear perro.");
        System.out.println("2. Dar de comer.");
        System.out.println("3. Jugar.");
        System.out.println("4. Dormir.");
        System.out.println("5. Mostrar estado.");
        System.out.println("6. Salir.");
        return lector.nextInt();
    }


}
