/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barcos_alquiler;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author Camilo Gallego B
 */
public class Barcos_Alquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su ID como cliente: ");
        String idcliente = scanner.nextLine();
        Barco barco = null;
       
        Cliente cliente = new Cliente(nombre, idcliente);
        System.out.println("Ingrese la matricula de su barco: ");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese la eslora del barco (en metros) ");
        double eslora = scanner.nextDouble();
        System.out.println("Ingrese el año nde fabricacion del barco: ");
        int añoFabricacion = scanner.nextInt();
         System.out.println("Tipo de barco: ");
        System.out.println("1. Barco convencional ");
        System.out.println("2. velero ");
        System.out.println("3. yate ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion){
            case 1: 
                System.out.println("Barco convencional");
                barco = new Barco(matricula, eslora, añoFabricacion);
                break;
            case 2: 
                System.out.println("velero ");
                System.out.println("Ingrese la cantidad de mastiles de el velero: ");
                int numeroMastiles = scanner.nextInt();
                barco = new Velero(matricula, eslora, añoFabricacion, numeroMastiles);
                break;
            case 3:
                System.out.println("yate");
                System.out.println("ingrese la potencia de su yate o HP: ");
                int potenciaMotor = scanner.nextInt();
                System.out.println("ingrese la cantidad de camarotes de su yate: ");
                int cantidadCamarotes = scanner.nextInt();
                barco = new Yate(matricula, eslora, añoFabricacion, potenciaMotor, cantidadCamarotes);
                break;
            default:
                System.out.println("opcion no valida");
                return;
        }
        System.out.println("Ingrese la fecha de alquiler del amarre (AAAA-MM-DD) ");
        String fechaInicioStr = scanner.next();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);
        System.out.println("Ingrese la fecha de fin o devolucion del amarre alquilado (AAAA-MM-DD): ");
        String fechaFinStr = scanner.next();
        LocalDate fechaFin = LocalDate.parse(fechaFinStr);
        System.out.println("Ingrese la posicion del amarre (posicion u o lugar donde se estaciona el barco): ");
        int posicionAmarre = scanner.nextInt();
        System.out.println("Ingrese la cantidad de amarres a alquilar: ");
        int cantidadAmarres = scanner.nextInt();
        Alquiler alquiler = new Alquiler(cliente, barco, fechaInicio, fechaFin, posicionAmarre, cantidadAmarres);
        
        alquiler.ImprimirRecibo();
        scanner.close();
    }
    
}
