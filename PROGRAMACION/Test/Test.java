package PROGRAMACION.Test;

public class Test {
    public static void main(String[] args) {
        int a = 3;
        modificar(a);
        System.out.println(a); // ¿Imprime 8 o imprime 3?
    }

    static int modificar(int x) {
       x += 5;
       return x;

    }
}


