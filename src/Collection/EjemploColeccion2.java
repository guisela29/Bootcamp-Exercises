package Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class EjemploColeccion2 {
    public static void main(String[] args) {

        // Implementar usando ArrayList para almacenar nombres de ciudades
        List<String> ciudades = new ArrayList<>();

        // Agregar tres ciudades
        ciudades.add("Lima");
        ciudades.add("Ayacucho");
        ciudades.add("Huancayo");

        System.out.println("Lista inicial de ciudades:");
        System.out.println(ciudades);
        System.out.println("Tamaño: " + ciudades.size());

        // Insertar una ciudad en la posición 1 (segunda posición)
        ciudades.add(1, "Arequipa");

        System.out.println("\nDespués de insertar 'Arequipa' en posición 1:");
        System.out.println(ciudades);
        System.out.println("Tamaño: " + ciudades.size());

        // Eliminar la última ciudad
        String ciudadEliminada = ciudades.remove(ciudades.size() - 1);

        System.out.println("\nDespués de eliminar la última ciudad ('" + ciudadEliminada + "'):");
        System.out.println(ciudades);
        System.out.println("Tamaño: " + ciudades.size());

        // Comparar el rendimiento con LinkedList
        System.out.println("\n--- Comparación de rendimiento ---");
        compararRendimiento();
    }

    // Método adicional para mostrar la diferencia entre ArrayList y LinkedList
    public static void compararRendimiento() {
        System.out.println("ArrayList es mejor para:");
        System.out.println("- Acceso aleatorio a elementos (get/set)");
        System.out.println("- Menos uso de memoria");

        System.out.println("\nLinkedList es mejor para:");
        System.out.println("- Muchas inserciones/eliminaciones al inicio");
        System.out.println("- Cuando no conoces el tamaño final");

        // Ejemplo con LinkedList
        System.out.println("\nEjemplo con LinkedList:");
        LinkedList<String> ciudadesLinked = new LinkedList<>();
        ciudadesLinked.add("Lima");
        ciudadesLinked.add("Cusco");
        ciudadesLinked.addFirst("Arequipa"); // Método específico de LinkedList
        ciudadesLinked.addLast("Trujillo");  // Método específico de LinkedList

        System.out.println("LinkedList: " + ciudadesLinked);
    }
}

