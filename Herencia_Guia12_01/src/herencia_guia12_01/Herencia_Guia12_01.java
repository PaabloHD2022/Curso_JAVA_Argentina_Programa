
package herencia_guia12_01;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author Pablo Demartini
 */
public class Herencia_Guia12_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stitch", "Carnivoro", 15, "Doberman");
            perro1.Alimentarse();
        Animal perro2 = new Perro("Teddy", "Corquetas", 10, "Chihuahua");
            perro2.Alimentarse();    
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
            gato1.Alimentarse();
        Animal caballo1 = new Caballo("Spark", "Pasto",25, "Fino");
            caballo1.Alimentarse();
        
//        Animal an = new Animal();
//        Perro pe = new Perro();
//        Gato ga = new Gato();
//        Caballo cab = new Caballo();
        
//        an.hacerRuido();
//        pe.hacerRuido();
//        ga.hacerRuido();
//        cab.hacerRuido();   
        
    }   
    
}
