

package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class Animal {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;    

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void hacerRuido(){
        System.out.println("Hola");
    }
    
    public void Alimentarse(){
        System.out.println("Me alimento de...");
    }
    
}
