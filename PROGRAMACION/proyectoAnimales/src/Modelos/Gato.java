package PROGRAMACION.proyectoAnimales.src.Modelos;

import java.util.Random;

//clase Gato que hereda de Animal
public class Gato extends Animal {
    private boolean tieneHumorParaJugar;

    public Gato(String nombre) {
        super(nombre);
        // El humor se define al azar
        this.tieneHumorParaJugar = new Random().nextBoolean();
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }

    @Override
    public void jugarCon(Animal otro) {
        if (otro instanceof Perrito && !tieneHumorParaJugar) {
            System.out.println(nombre + " no está de humor y se va a otro lado.");
        } else {
            System.out.println(nombre + " juega con " + otro.nombre + " de manera elegante.");
            otro.hacerSonido();
        }
    }

    public boolean isTieneHumorParaJugar() {
        return tieneHumorParaJugar;
    }

    public void setTieneHumorParaJugar(boolean tieneHumorParaJugar) {
        this.tieneHumorParaJugar = tieneHumorParaJugar;
    }
}