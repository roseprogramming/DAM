package PROGRAMACION.poo.proyectoPerro;
//CREO MI CLASE PERRO. INDICO QUÉ ATRIBUTOS TIENE.
public class Perro  {
    private String nombre;
    private int edad;
    private int nivelEnergia;
    protected int nivelHambre;
    public String estadoAnimo;

    //BLOQUE DEFINICION DE CONSTANTES
    public static int numPerros= 0;
    public static final int ENERGIA_MAX=100;
    public static final int HAMBRE_MIN=0;
    public static final String FELIZ= "feliz";
    //CREAMOS CONSTRUCTORES
    public Perro (String nombre, int edad, int nivelEnergia, int nivelHambre,String estadoAnimo){
        this.nombre=nombre;
        this.edad=edad;
        this.estadoAnimo=estadoAnimo;
        this.nivelEnergia=nivelEnergia;
        this.nivelHambre=nivelEnergia;
    }
    public Perro (){
        this.nombre="no tengo nombre";
        this.edad=0;
        this.estadoAnimo=FELIZ;
        this.nivelEnergia=ENERGIA_MAX;
        this.nivelHambre=HAMBRE_MIN;
    }
    public Perro(String nombre){
        this.nombre= nombre;
        this.edad=0;
        this.estadoAnimo=FELIZ;
        this.nivelEnergia=ENERGIA_MAX;
        this.nivelHambre=HAMBRE_MIN;
    }
    
//CREAMOS GETTERS AND SETTERS (METODOS PARA ACCEDER Y MODIFICAR LOS ATRIBUTOS PRIVADOS DE UNA CLASE)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }
    public void comer(){
        this.nivelHambre--;
    }
    public void jugar(){
        this.nivelEnergia--;
        this.nivelHambre++;
        System.out.println("guau guau que bien me lo paso");
    }
    public void dormir(){
        System.out.println("zzzzzzZZZZ");
        this.nivelEnergia++;
    }
    public void mostrarEstado(){
        System.out.println();
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Nivel ernergía: "+ this.nivelEnergia);
        System.out.println("Nivel hambre: "+ this.nivelHambre);
        System.out.println("Estado de ánimo: "+ this.estadoAnimo);
    }


    



}
