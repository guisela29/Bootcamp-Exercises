package feature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsGuide {
    public static void main(String[] args) {
             /*List<String> lenguajes = new ArrayList<>();
                lenguajes.add("kotlin");
                lenguajes.add("java");
                lenguajes.add("python");
                lenguajes.add("javascript");
                lenguajes.add("c++");

                // Recorrer la lista
        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }
        lenguajes.sort(Comparator.comparing(String::length));
        System.out.println("El elemento Java existe: " + lenguajes.contains("java"));

      // Sistema de Calificacion usando una list
        List<Double> calificaciones = new ArrayList<>();
        calificaciones.add(11.4);
        calificaciones.add(18.8);
        calificaciones.add(13.4);
        calificaciones.add(14.5);
        calificaciones.add(16.5);

        // Calcular el promedio
        double suma =0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma/ calificaciones.size();
        System.out.println("El promedio de las calificaciones es: " + promedio);

        // Encontrar la calificación más alta
        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("La nota mas alta es: " + max);
        System.out.println("La nota mas baja es: " + min);
*/

    //SETS
    List<String> paises = new ArrayList<>();
    paises.add("Peru");
    paises.add("Chile");
    paises.add("Colombia");
    paises.add("Argentina");
    paises.add("Ecuador");
    for (String pais : paises) {
        System.out.println(pais);
    }

    }
}
