
package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class PersonaServicio {
    
    public Persona registrarPersona(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre del cliente");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido del cliente");
        persona.setApellido(leer.next());
        System.out.println("Ingrese el DNI");
        persona.setDocumento(leer.nextInt());
        System.out.println("Ingrese el email");
        persona.setEmail(leer.next());
        System.out.println("Ingrese el domicilio");
        persona.setDomicilio(leer.next());
        System.out.println("Ingrese el nro de telefono");
        persona.setTelefono(leer.nextInt());
        return persona;
    }    
}
