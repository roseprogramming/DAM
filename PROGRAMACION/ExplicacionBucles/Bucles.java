package PROGRAMACION.ExplicacionBucles;

public class Bucles {
    public static void main(String [] args){
        for(int i= 0; i < 5; i++){
            if (i < 4) { System.out.println("no soy el último");}
            else {System.out.println("Soy el último");}
        }
        int contador = 0;
        while (contador < 10){
            System.out.println("Dentro del bucle " + contador);
            contador++;
        }

        System.out.println("Fuera del bucle " + contador);
    }
}