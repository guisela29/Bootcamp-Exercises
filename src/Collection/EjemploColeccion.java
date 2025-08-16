package Collection;

import java.util.ArrayList;
import java.util.List;

public class EjemploColeccion {
    public static void main(String[] args) {
        // Crear una colección de enteros
        List<Integer> numeros = new ArrayList<>();

        // Agregar números del 1 al 5
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Verificar si contiene el número 3
        if (numeros.contains(6)) {
            System.out.println("La colección contiene el número 6");
        } else {
            System.out.println("La colección NO contiene el número 6");
        }

        // Imprimir el tamaño de la colección
        System.out.println("Tamaño de la colección: " + numeros.size());

        // Bonus: mostrar todos los elementos
        System.out.println("Elementos en la colección: " + numeros);
    }

}
