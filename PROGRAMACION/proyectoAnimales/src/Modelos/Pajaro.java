package PROGRAMACION.proyectoAnimales.src.Modelos;

// Nueva clase Pajaro
public class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    @Override
    public void jugarCon(Animal otro) {
        if (otro instanceof Perrito) {
            System.out.println(nombre + " se asusta y vuela a un árbol.");
        } else {
            System.out.println(nombre + " canta mientras juega con " + otro.nombre + ".");
        }
        otro.hacerSonido();
    }
}