package PROGRAMACION.RecomendadorDePeliculas;

public class RecomendadorDepeliculas {

    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        String genero= args[0];
        int duracion = Integer.parseInt(args [1]);
      
        if (genero.equalsIgnoreCase("Acción")) {
            System.out.println("Te gustan las películas de puñetazos"); 
        } else if (genero.equalsIgnoreCase("Terror")) {
            if(duracion < 90) {
                System.out.println("A Quiet Place (90 minutos)");
            } else if (duracion <= 120) {
            System.out.println("Hereditary (127 minutos)");
            } else {
            System.out.println("The Shining (146 minutos)");
            }
        } else if (genero.equalsIgnoreCase("Ciencia ficción")) {
            System.out.println("Te gustan los marcianos ");
        } else if (genero.equalsIgnoreCase("Drama")) {
        System.out.println("Te gusta llorar");
        } else {System.out.println("Género no disponible");
    }
}
}