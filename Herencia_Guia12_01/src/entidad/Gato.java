
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    } 
    
    @Override
    public void Alimentarse(){
        System.out.println("Yo me alimento de Galletas");
    }

}
