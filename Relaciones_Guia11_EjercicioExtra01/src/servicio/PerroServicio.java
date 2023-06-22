
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class PerroServicio {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<Perro>perros = new ArrayList();
    
    public ArrayList<Perro> cargarPerro(){
        
        //Cargamos perros 
        perros.add(new Perro("Firulais", "Callejero", 4 , "Chico" , true));
        perros.add(new Perro("Thor", "Caniche", 10 , "Chico", false));
        perros.add(new Perro("Lucero", "Seter", 3 , "Grande", false));
        perros.add(new Perro("Violeta", "Labrador", 8 , "Grande", true));
        
        String opcion;
        
        do {
            
        Perro perro = new Perro();
            System.out.println("Ingrese el nombre del perro:");
            perro.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro:");
            perro.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro:");
            perro.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro:");
            perro.setTamano(leer.next());
            System.out.println("Esta adoptado?");
            perro.setAdoptado(leer.nextBoolean());             
            System.out.println("desea cargar otra persona? (S/N");    
            opcion = leer.next();
            perros.add(perro);
        } while (opcion.equalsIgnoreCase("S"));       
     
        return perros;   
    }    
}
