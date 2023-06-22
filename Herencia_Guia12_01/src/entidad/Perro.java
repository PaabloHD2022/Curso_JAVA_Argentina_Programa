
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class Perro extends Animal {
    
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override    
    public void hacerRuido(){
        System.out.println("Guau");
    }
    
    @Override
    public void Alimentarse(){
        System.out.println("Me alimento de Croquetas");
    }  
    
    
}
