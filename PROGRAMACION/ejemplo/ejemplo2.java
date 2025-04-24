package PROGRAMACION.ejemplo;

import java.util.LinkedList;
import java.util.Stack;

public class ejemplo2 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

Stack<String> pila = new Stack<>();

lista.add("Java");

pila.push("Collections");

lista.add(pila.pop());

System.out.println(lista);
    }

}
