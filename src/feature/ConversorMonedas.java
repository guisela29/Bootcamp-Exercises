package feature;
import java.util.Scanner;
public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Tasas de cambio (soles como base)
        final double SOLES_A_DOLARES = 0.28;  // 1 sol = 0.28 dólares
        final double SOLES_A_EUROS = 0.24;    // 1 sol = 0.24 euros
        final double SOLES_A_YENES = 41.61;    // 1 sol = 41.61 yenes;
        final double SOLES_A_RUBLOS = 22.54;   // 1 sol = 22.54 rublos;

        while (continuar) {
            mostrarMenuPrincipal();
            int opcionPrincipal = obtenerOpcion(scanner, 1, 3);

            switch (opcionPrincipal) {
                case 1:
                    conversorMonedas(scanner, SOLES_A_DOLARES, SOLES_A_EUROS, SOLES_A_YENES, SOLES_A_RUBLOS);
                    break;

                case 2:
                    tablaMultiplicar(scanner);
                    break;

                case 3:
                    System.out.println("¡Gracias por usar el conversor!");
                    continuar = false;
                    break;
            }

            if (continuar) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("    BIENVENIDO");
        System.out.println("CONVERSOR DE MONEDAS Y");
        System.out.println("  TABLA DE MULTIPLICAR");
        System.out.println("=".repeat(40));

        System.out.println("\nIngrese su opción:");
        System.out.println("1. Conversor de Monedas (S/)");
        System.out.println("2. Tabla de Multiplicar");
        System.out.println("3. Salir");
        System.out.print("\nOpción: ");
    }

    public static void conversorMonedas(Scanner scanner, double dolares, double euros, double yenes, double rublos) {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("    CONVERSOR DE MONEDAS S/");
        System.out.println("=".repeat(30));

        System.out.print("\nIngrese el monto en soles: ");

        // Validar que sea un número
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Ingrese un número válido");
            System.out.print("Ingrese el monto en soles: ");
            scanner.next();
        }

        double monto = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer

        // Validar que sea positivo
        if (monto < 0) {
            System.out.println("Error: El monto debe ser positivo");
            return;
        }

        System.out.println("\nConvertir a:");
        System.out.println("1. Dólares");
        System.out.println("2. Euros");
        System.out.println("3. Yenes");
        System.out.println("4. Rublos");
        System.out.println("5. Mostrar todas las conversiones");

        int opcion = obtenerOpcion(scanner, 1, 5);

        System.out.println("\n" + "-".repeat(35));
        System.out.println("RESULTADO DE CONVERSIÓN");
        System.out.println("-".repeat(35));

        switch (opcion) {
            case 1:
                double resultadoDolares = monto * dolares;
                System.out.printf("S/ %.2f = $ %.2f USD%n", monto, resultadoDolares);
                break;

            case 2:
                double resultadoEuros = monto * euros;
                System.out.printf("S/ %.2f = € %.2f EUR%n", monto, resultadoEuros);
                break;

            case 3:
                double resultadoYenes = monto * yenes;
                System.out.printf("S/ %.2f = ¥ %.2f JPY%n", monto, resultadoYenes);
                break;

            case 4:
                double resultadoRublos = monto * rublos;
                System.out.printf("S/ %.2f = ₽ %.2f RUB%n", monto, resultadoRublos);
                break;

            case 5:
                System.out.printf("S/ %.2f equivale a:%n", monto);
                System.out.printf("• $ %.2f USD (Dólares)%n", monto * dolares);
                System.out.printf("• € %.2f EUR (Euros)%n", monto * euros);
                System.out.printf("• ¥ %.2f JPY (Yenes)%n", monto * yenes);
                System.out.printf("• ₽ %.2f RUB (Rublos)%n", monto * rublos);
                break;
        }

        // Mostrar opción de calculadora
        System.out.println("\n¿Desea usar la calculadora? (s/n): ");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("s") || respuesta.equals("si")) {
            calculadoraSimple(scanner);
        }
    }

    public static void tablaMultiplicar(Scanner scanner) {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("    TABLA DE MULTIPLICAR");
        System.out.println("=".repeat(30));

        System.out.print("Ingrese un número (1-12): ");
        int numero = obtenerOpcion(scanner, 1, 12);

        System.out.println("\n" + "-".repeat(25));
        System.out.printf("   TABLA DEL %d%n", numero);
        System.out.println("-".repeat(25));

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
    }

    public static void calculadoraSimple(Scanner scanner) {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("      CALCULADORA SIMPLE");
        System.out.println("=".repeat(30));

        System.out.print("Primer número: ");
        double num1 = obtenerNumero(scanner);

        System.out.println("\nOperaciones:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");

        int operacion = obtenerOpcion(scanner, 1, 4);

        System.out.print("Segundo número: ");
        double num2 = obtenerNumero(scanner);

        double resultado = 0;
        String simbolo = "";
        boolean operacionValida = true;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                simbolo = "+";
                break;
            case 2:
                resultado = num1 - num2;
                simbolo = "-";
                break;
            case 3:
                resultado = num1 * num2;
                simbolo = "*";
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero");
                    operacionValida = false;
                } else {
                    resultado = num1 / num2;
                    simbolo = "/";
                }
                break;
        }

        if (operacionValida) {
            System.out.println("\n" + "-".repeat(20));
            System.out.printf("%.2f %s %.2f = %.2f%n", num1, simbolo, num2, resultado);
            System.out.println("-".repeat(20));
        }
    }

    // Método para obtener una opción válida en un rango
    public static int obtenerOpcion(Scanner scanner, int min, int max) {
        int opcion;

        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                if (opcion >= min && opcion <= max) {
                    break;
                } else {
                    System.out.printf("Error: Ingrese un número entre %d y %d: ", min, max);
                }
            } else {
                System.out.printf("Error: Ingrese un número entre %d y %d: ", min, max);
                scanner.next();
            }
        }

        return opcion;
    }

    // Método para obtener un número válido (con decimales)
    public static double obtenerNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Error: Ingrese un número válido: ");
            scanner.next();
        }

        double numero = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        return numero;
    }

}
