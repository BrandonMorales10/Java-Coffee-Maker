// Clase Principal
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(1000, 500);
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("a: Llenar cafetera");
            System.out.println("b: Servir taza");
            System.out.println("c: Agregar café");
            System.out.println("d: Vaciar cafetera");
            System.out.println("e: Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    cafetera.llenarCafetera();
                    break;
                case "b":
                    System.out.println("Ingrese la capacidad de la taza:");
                    int capacidadTaza = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    cafetera.servirTaza(capacidadTaza);
                    break;
                case "c":
                    System.out.println("Ingrese la cantidad de café a agregar:");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    cafetera.agregarCafe(cantidad);
                    break;
                case "d":
                    cafetera.vaciarCafetera();
                    break;
                case "e":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
