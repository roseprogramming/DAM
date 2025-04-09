package PROGRAMACION.proyectoSuperHeroes.src;

abstract public class SuperHeroe {
    private String nombre;
    private String identidadSecreta;
    
    /**
     * 
     * @param nombre
     * @param identidadSecreta
     */
    public SuperHeroe(String nombre, String identidadSecreta){
        this.nombre=nombre;
        this.identidadSecreta=identidadSecreta;
    }
        
}

