/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barcos_alquiler;

/**
 *
 * @author Camilo Gallego B
 */
public class Cliente {
    String nombre;
    String idcliente;
    
    public Cliente(String nombre, String idcliente){
        this.nombre = nombre;
        this.idcliente = idcliente;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getidcliente(){
        return idcliente;
    }
    public void getidcliente(String idcliente){
        this.idcliente = idcliente;
    }
}
