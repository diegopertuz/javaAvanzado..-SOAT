/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soat;

/**
 *
 * @author CBN
 */
public class SOAT {
   
    public SOAT(){
        
    }
    
    public double calcular(int tipoVehiculo, double cantAccidentes,boolean infraccion){
        
        double total=0;
        double subtotal=0,cargoAccidente=0,cargoInfraccion=0 ;
        switch(tipoVehiculo){
            
            case 1://carro
                subtotal = 280000;
                break;
            case 2:
                subtotal = 480100;
                break;
        }
        if (cantAccidentes <= 10) {
            cargoAccidente = subtotal*(cantAccidentes/10);
        }else{
            cargoAccidente = subtotal;
        }
        if (infraccion) {
            cargoInfraccion = subtotal*0.45;
        }else{
            cargoInfraccion = 0;
        }
        
        total = subtotal+cargoAccidente+cargoInfraccion;
        
        return total;
        
    }

    
}
