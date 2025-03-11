package PROGRAMACION.Pelicula;

public class Pelicula {
    public String titulo;
    public String director;
    public String genero;

    public Pelicula(String titulo, String director, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
    }
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula("The Matrix", "Wachowkis","Ciencia Ficción");
        System.out.println(matrix.titulo);
        System.out.println(matrix.director);
        System.out.println(matrix.genero);
    }
}
