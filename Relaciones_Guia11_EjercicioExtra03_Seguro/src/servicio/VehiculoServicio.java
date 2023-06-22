
package servicio;

import entidad.Vehiculo;
import enums.Color;
import enums.Tipo;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class VehiculoServicio {
    
    public Vehiculo registrarVehiculo(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese marca del vehiculo");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehiculo");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese el año del vehiculo");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Ingrese el numero de motor del vehiculo");
        vehiculo.setNumeroMotor(leer.nextLong());
        System.out.println("Ingrese el numero de chasis");
        vehiculo.setChasis(leer.next());
        System.out.println("Ingrese el color del vehiculo");
        System.out.println("1 - ROJO");
        System.out.println("2 - VERDE");
        System.out.println("3 - GRIS");
        System.out.println("4 - NEGRO");
        System.out.println("5 - AZUL");
        System.out.println("6 - BLANCO");
        int color = leer.nextInt()-1;
        vehiculo.setColor(Color.values()[color]);        
        System.out.println("Ingrese el tipo de vehiculo");
        System.out.println("1 - SEDAN");
        System.out.println("2 - SUV");
        System.out.println("3 - TODO TERRENO");
        System.out.println("4 - CAMIONETA");
        System.out.println("5 - CAMION");
        int tipo = leer.nextInt();
        vehiculo.setTipo(Tipo.values()[tipo]);        
        return vehiculo;       
    }    
}
