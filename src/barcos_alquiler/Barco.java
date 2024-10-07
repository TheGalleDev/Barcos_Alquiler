/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barcos_alquiler;

/**
 *
 * @author Camilo Gallego B
 */
public class Barco {
    private String matricula;
    private double eslora;
    private int añoFabricacion;
    
    public Barco (String matricula, double eslora, int añoFabricacion){
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }
    public String getmatricula(){
        return matricula;
    }
    public void setmatricula(String matricula){
        this.matricula = matricula;
    }
    public double geteslora(){
        return eslora;
    }
    public void seteslora(double eslora){
        this.eslora = eslora;
    }
    public int getañoFabricacion(){
        return añoFabricacion;
    }
    public void setañoFabricacion(int añoFabricacion){
        this.añoFabricacion = añoFabricacion;
    }
}
class Velero extends Barco{
    private int numeroMastiles;
    
    public Velero(String matricula, double eslora, int añoFabricacion, int numeroMastiles){
        super(matricula, eslora, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    public int getnumeroMastiles(){
        return numeroMastiles;
    }
    public void setnumeroMastiles(int numeroMastiles){
        this.numeroMastiles = numeroMastiles;
    }
}
class Yate extends Barco{
        private int potenciaMotor;
        private int numeroCamarote;
        
        public Yate(String matricula, double eslora, int añoFabricacion, int potenciaMotor, int numeroCamarote){
            super(matricula, eslora, añoFabricacion);
            this.potenciaMotor = potenciaMotor;
            this.numeroCamarote = numeroCamarote;
        }
        public int getpotenciaMotor(){
            return potenciaMotor;
        }
        public void setpotenciaMotor(int potenciaMotor){
            this.potenciaMotor = potenciaMotor;
        }
        public int getnumeroCamarote(){
            return numeroCamarote;
        }
        public void setnumeroCamarote(int numeroCamarote){
          this.numeroCamarote = numeroCamarote;  
        }
    }