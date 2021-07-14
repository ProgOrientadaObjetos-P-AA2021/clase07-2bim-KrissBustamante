/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author USUARIO
 */
public class TransporteAereo extends Transporte {
     private String Aereo;
    
    
    public void establecerAereo(String n){
        Aereo = n;
    }
    
     @Override
    public void establecerTarifa(){
        tarifa = (0.40*0.5);
    }
    
    
    public String obtenerAereo(){
        return Aereo;
    }
      
}
