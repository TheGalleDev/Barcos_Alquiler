/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barcos_alquiler;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author Camilo Gallego B
 */
public class Alquiler {
    private Cliente cliente;
    private Barco barco;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int posicionAmarre;
    private int cantidadAmarres;
    private final double PRECIO_DIA = 25000;
    
    public Alquiler(Cliente cliente, Barco barco, LocalDate fechaInicio, LocalDate fechaFin, int posicionAmarre,int cantidadAmarres){
        this.cliente = cliente;
        this.barco = barco;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
        this.cantidadAmarres = cantidadAmarres;
    }
    public double CalcularPrecio() {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return diasOcupacion * PRECIO_DIA * cantidadAmarres;
    }

    public String FormatearPrecio(double precio) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(precio);
    }

    public void ImprimirRecibo(){
        System.out.println("------------------ RECIBO DE ALQUILER ---------------------------------");
        System.out.println("Cliente. " + cliente.getnombre());
        System.out.println("ID cliente: " + cliente.idcliente);
        System.out.println("Matricula Barco: " + barco.getmatricula());
        System.out.println("Eslora: " + barco.geteslora() + "metros");
        System.out.println("Cantidad de amarres alquilados: " + cantidadAmarres );
        System.out.println("Año de fabricacion: " + barco.getañoFabricacion() );
        
        if(barco instanceof Velero){
            System.out.println("Tipo de Barco: Velero");
            Velero velero = (Velero) barco;
            System.out.println("Número de mástiles: " + velero.getnumeroMastiles());
        }else if (barco instanceof Yate){ 
             System.out.println("Tipo de Barco: Yate");
            Yate yate = (Yate) barco;
            System.out.println("Potencia del motor: " + yate.getpotenciaMotor() + " CV");
            System.out.println("Número de camarotes: " + yate.getnumeroCamarote());  
        }else {
            System.out.println("Tipo de Barco: Barco convencional");
        }
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de finalizacion: " + fechaFin);
        System.out.println("Posicion de amarre: " + posicionAmarre);
        double total = CalcularPrecio();
        System.out.println("Total a pagar: " + FormatearPrecio(total));
    
    }
    
}
