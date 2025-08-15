package feature;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    String genero;

    // Constructor por defecto
    public Persona() {}

    public Persona(String nombre, String apellido, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    // Método para presentarse
    public void presentarse() {
        System.out.println("Mi nombre es " + nombre + " " + apellido + " y soy de género " + genero);
    }
}
