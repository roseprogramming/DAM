package PROGRAMACION.poo.proyectoPerro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        int auxPerros;
        String nombre;
        Perro [] perros= new Perro[10];

        //INICIO DEL JUEGO:
        do {//imprimimos menú por pantalla-damos opciones
            opcion=Menu.menu(lector);
             //realizamos acción según la opción elegida
            switch (opcion) {
                case 1: 
                    System.out.println("!Ha nacido un nuevo cachorro!");
                    System.out.println("¿¿Cómo quieres llamarlo?");
                    nombre=lector.next();
                    perros[Perro.numPerros]=new Perro(nombre);
                    Perro.numPerros++;
                    break;

                case 2: 
                    System.out.println("¿A qué perro quieres dar de comer? Hay "+Perro.numPerros);
                    auxPerros= lector.nextInt();
                    perros[auxPerros-1].comer();
                break;
 
                case 3:
                    System.out.println("¿Con qué perro quieres jugar? Hay "+Perro.numPerros);
                    auxPerros= lector.nextInt();
                    perros[auxPerros-1].jugar();
                break;
 
                case 4: System.out.println("¿Qué perro debe dormir? Hay "+Perro.numPerros);
                    auxPerros= lector.nextInt();
                    perros[auxPerros-1].dormir();
                break;
 
                case 5: System.out.println("¿De qué perro quieres conocer el estado? Hay "+Perro.numPerros);
                    auxPerros= lector.nextInt();
                    perros[auxPerros-1].mostrarEstado();
                break;

                case 6:
                    System.out.println ("Gracias por jugar.");
                break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion!=6);
        
       
        /*
        Perro miPerro= new Perro("Pimpi",3,4,5,"fiu fiu");
        Perro tuPerro= new Perro();
        Perro masPerro= new Perro("más perro");

        miPerro.mostrarEstado();
        tuPerro.mostrarEstado();
        masPerro.mostrarEstado();
        */

        lector.close();
    }
}
