import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidad;
        do {
            System.out.println("Ingrese la cantidad de personas");
            cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            if (cantidad <= 0) {
                System.out.println(" La cantidad debe ser mayor que 0");
            }
        } while (cantidad <= 0);

        Binaria binaria = new Binaria();
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            int edad;
            do {
                System.out.println("Ingrese la edad de la persona " + (i + 1) + ": ");
                edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                if (edad < 0) {
                    System.out.println(" La edad no puede ser negativa");
                }
            } while (edad < 0);

            personas[i] = new Persona(nombre, edad);
        }

        binaria.insercionEdad(0, personas);

        int edadBuscada;
        do {
            System.out.println("Ingrese la edad a buscar ");
            edadBuscada = scanner.nextInt();
            if (edadBuscada < 0) {
                System.out.println(" La edad a buscar no puede ser negativa");
            }
        } while (edadBuscada < 0);

        binaria.busquedaBinaria(edadBuscada, personas);
    }
}
