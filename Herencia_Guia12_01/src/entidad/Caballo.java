
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class Caballo extends Animal {
    
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Relinche...");
    }
    
    @Override
    public void Alimentarse(){
        System.out.println("Yo me alimento de pasto");
    }
    
    
    
}