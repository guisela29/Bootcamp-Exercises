package feature;

public class car {
// Atributos
   String color;
    String marca;
    String modelo;

    // Constructor por defecto

    public car() {}

        public car(String color, String marca, String modelo) {
            this.color = color;
            this.marca = marca;
            this.modelo = modelo;

    }
public void acelerate () {
        System.out.println("El coche " + marca + " " + modelo + " de color " + color + " está acelerando.");
    }

    public void brake() {
        System.out.println("El coche " + marca + " " + modelo + " de color " + color + " está frenando.");
    }

    public void turn(String direction) {
        System.out.println("El coche " + marca + " " + modelo + " de color " + color + " está girando a la " + direction + ".");
    }
}

