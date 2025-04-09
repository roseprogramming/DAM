package PROGRAMACION.proyectoAnimales.src.Modelos;

public class Perrito extends Animal {
    public Perrito(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    @Override
    public void jugarCon(Animal otro) {
        System.out.println(nombre + " está jugando con " + otro.nombre);
        
        if (otro instanceof Gato) {
            System.out.println(nombre + " intenta jugar con " + otro.nombre + ", pero espera la reacción del gato...");
        } else if (otro instanceof Pajaro) {
            System.out.println(otro.nombre + " se asusta y vuela lejos.");
        }

        otro.hacerSonido();
    }
}
