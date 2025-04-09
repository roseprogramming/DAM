package PROGRAMACION.proyectoAnimales.src;
import PROGRAMACION.proyectoAnimales.src.Modelos.Animal;
import PROGRAMACION.proyectoAnimales.src.Modelos.Gato;
import PROGRAMACION.proyectoAnimales.src.Modelos.Pajaro;
import PROGRAMACION.proyectoAnimales.src.Modelos.Perrito;


// Clase principal donde interactúan Perro, Gato y Pájaro
public class Main {
    public static void main(String[] args) {
        // Creamos un perro, un gato y un pájaro
        Animal miPerro = new Perrito("Pimpi");
        Animal miGato = new Gato("Misu");
        Animal miPajaro = new Pajaro("Piolín");
        // Ambos hacen su sonido
        miPerro.hacerSonido();
        miGato.hacerSonido();
        miPajaro.hacerSonido();

        // Interacción: Perro juega con Gato
        miPerro.jugarCon(miGato);

        // Interacción: Gato juega con Perro
        miGato.jugarCon(miPerro);

        // Interacción: Pájaro juega con Perro
        miPajaro.jugarCon(miPerro);

        // Interacción: Gato juega con Pájaro
        miGato.jugarCon(miPajaro);
    }
}



