/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */

public class Principal {

    public static void main(String[] args) {

        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();

        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerTransvia("Transvia Cuenca");
        t3.establecerTarifa();

        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerAereo("Aero Catamayo");
        aereo.establecerTarifa();

        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerMaritimo("Maritimo subbway ");
        mar.establecerTarifa();

        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t3);
        lista.add(aereo);
        lista.add(mar);

        TiposTransporte tipos = new TiposTransporte();

        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }
}























/*public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        
        ArrayList <Transporte> listas = new ArrayList();
        
        listas.add(bus);
        listas.add(taxi);
       // tipos.establecerTransporteBus(bus);
       // tipos.establecerTransporteTaxi(taxi);
       // tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
*/
