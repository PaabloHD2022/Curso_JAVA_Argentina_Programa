
package relaciones_guia11_ejercicioextra01;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import servicio.PerroServicio;
import servicio.PersonaServicio;

/*1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. 
 * Nuestro programa va a tener que contar con muchas personas y muchos perros. 
 * El programa deberá preguntarle a cada persona, que perro según su nombre, quiere adoptar. 
 * Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que 
 * ya estaba adoptado, se le debe informar a la persona.

* Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
  personas con sus respectivos perros.
 *
 * @author Pablo Demartini
 */
public class Relaciones_Guia11_EjercicioExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Perro> perroList = new ArrayList<>();
        Persona p = new Persona();
        PersonaServicio ps = new PersonaServicio();
        PerroServicio perroS =  new PerroServicio();            
        
        ps.cargarPersona();
        perroList = perroS.cargarPerro();        
        ps.adoptarPerro(perroList);
        ps.mostrarPerona();
    }    
}
