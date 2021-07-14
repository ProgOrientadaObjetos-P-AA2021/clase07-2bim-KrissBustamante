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
public class TransporteMaritimo extends Transporte{
  private String maritimo ;
    
    
    public void establecerMaritimo (String n){
        maritimo  = n;
    }
    
     @Override
    public void establecerTarifa(){
        tarifa = (0.40*0.3);
    }
    
    
    public String obtenerCooperativaTaxi(){
        return maritimo ;
    }
        
}
