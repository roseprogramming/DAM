package PROGRAMACION.proyectoAnimales.src.Modelos;

    public abstract class Animal {
        protected String nombre;
    
        // Constructor
        public Animal(String nombre) {
            this.nombre = nombre;
        }
    
        // Método abstracto para hacer sonidos (cada animal lo implementa a su manera)
        public abstract void hacerSonido();
    
        // Método jugarCon() en la clase abstracta para que todos los animales lo implementen
        public abstract void jugarCon(Animal otro);
    }

