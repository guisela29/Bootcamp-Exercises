import feature.car;
import feature.Persona;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
        // Crear un objeto de la clase car
car myCar = new car("Rojo", "Toyota", "Corolla");

        // Llamar a los métodos del objeto
myCar.acelerate();
myCar.brake();
myCar.turn("izquierda");

        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona( "Guisela", "Martinez", "Femenino");

        // Llamar a los métodos del objeto
        persona1.saludar();
        persona1.presentarse();

     // CALCULADORA
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese el primer numero:");
     int primerNumero = scanner.nextInt();
     System.out.println("Ingrese el segundo numero:");
     int segundoNumero = scanner.nextInt();
     int resultado = primerNumero + segundoNumero;
     int resta = primerNumero - segundoNumero;
     int resultado2 = primerNumero * segundoNumero;
     double division = (double) primerNumero / segundoNumero;

     System.out.println("La suma de los numeros es:"+ resultado);
        System.out.println("La resta de los numeros es:"+ resta);
        System.out.println("La division de los numeros es:"+ division);
        System.out.println("La multiplicacion de los numeros es:"+ resultado2);
     scanner.close();

    }
    private static int sumar(int primerNumero, int segundoNumero) {
        return primerNumero + segundoNumero;
    }


}
