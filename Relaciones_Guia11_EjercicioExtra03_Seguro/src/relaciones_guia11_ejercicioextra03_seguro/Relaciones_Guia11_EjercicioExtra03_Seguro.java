
package relaciones_guia11_ejercicioextra03_seguro;

import entidad.Poliza;
import servicio.PolizaServicio;

/**
 *
 * @author Pablo Demartini
 */
public class Relaciones_Guia11_EjercicioExtra03_Seguro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PolizaServicio ps = new PolizaServicio();
        Poliza poliza = ps.contratarSeguro();        
    }    
}
