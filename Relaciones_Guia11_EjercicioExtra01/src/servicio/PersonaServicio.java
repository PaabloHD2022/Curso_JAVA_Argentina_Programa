
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/***1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. 
 * Nuestro programa va a tener que contar con muchas personas y muchos perros. 
 * El programa deberá preguntarle a cada persona, que perro según su nombre, quiere adoptar. 
 * Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que 
 * ya estaba adoptado, se le debe informar a la persona.

* Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
  personas con sus respectivos perros.
 *
 * @author Pablo Demartini
 */
public class PersonaServicio {
    
    ArrayList<Persona> personas = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarPersona(){
        
        //Creamos una lista de personas para no tener que cargar por sistema.
        personas.add(new Persona ("Carlos", "Perez", 64 , 345655544));
        personas.add(new Persona ("Jose", "Perez", 48 , 345674544));
        personas.add(new Persona ("Analia", "Perez", 24 , 346545544));
        personas.add(new Persona ("Sofia", "Perez", 30 , 357807544));
        
        String opcion;
        
        //Cargamos personas a mano.
        do {
            
        Persona persona = new Persona();
        System.out.println("ingrese su nombre:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido:");
        persona.setApellido(leer.next());
        System.out.println("Ingrese su edad:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el dni");
        persona.setDni(leer.nextInt());
        System.out.println("desea cargar otra persona? (S/N");    
        opcion = leer.next();
        personas.add(persona);
        } while (opcion.equalsIgnoreCase("S"));  
        
    }
     
    
    // Método para adoptar perro
    public void adoptarPerro(ArrayList<Perro> perroList) {
            // Preguntamos a las personas qué perro quiere adoptar
            for (Persona persona : personas){
            System.out.println("Ingrese el nombre del perro que quiere adoptar:");
            // Mostramos lista de perros
            for (Perro perro : perroList){
                System.out.println(perro.getNombre());
            }
            // Leemos el nombre ingresado por el usuario
            String nombre = leer.next();
            // En base al nombre del perro ingresado buscamos la posición dentro de la lista.
            int posicion = -1;
            for (int i = 0; i < perroList.size(); i++){
                if (perroList.get(i).getNombre().equals(nombre)) {
                    posicion = i;
                    break;
                }
            }
            
            // Verificamos si el perro ingresado está en la lista
            if (posicion < 0){
                // Si no está, se informa al usuario
                System.out.println("El perro ingresado no se encuentra en la lista");
            }else{
                // Se confirma si el perro está en la lista
                System.out.println("El perro está en la lista");
            
                // Mostramos al usuario si el perro seleccionado ya está adoptado
                Perro perroAdoptado = perroList.get(posicion);
                if (perroAdoptado.isAdoptado()){
                    System.out.println("Este perro está actualmente adoptado");
                }else{
                    // Si el perro está disponible para adopción, se adopta
                    System.out.println(nombre + "el perro ingresado está disponible para adoptar, FELICITACIONES!!!");
                    // Se setea el perro como ADOPTADO
                    perroAdoptado.setAdoptado(true);
                    // Se agrega el perro a la lista del usuario
                    persona.getPerrosAdoptado().add(perroAdoptado);
                }
            }           
        }       
    }
    
    public void mostrarPerona(){
        for (Persona persona : personas) {
            System.out.println(personas.toArray());
            
        }
    }
    
}


    
    
//    public void adoptarPerro(ArrayList<Perro>perroList){
//        //Preguntamos a las personas cual perro quiere adoptar
//        for (Persona persona : personas) {
//            System.out.println("Ingrese el nombre del perro que quiere adoptar?");
//            
//            //Con el for each recorremos la lista de perros para mostrar los nombres de los perros.
//            for (Perro perro : perroList) {
//                System.out.println(perro.getNombre());
//            }
//            
//            //Leemos el nombre ingresado por el usuario
//            String nombre = leer.next();            
//            //En base al nombre del perro ingresado buscamos la posicion dentro de la lista.
//            int posicion= -1;
//            Perro perroAdoptado = perroList.get(posicion);
//            
//            //Verificamos si el perro ingresado esta en la lista
//            if(posicion < 0){
//            
//            //Si no esta se lo informa al usuario
//                System.out.println("El perro no existe en la lista");                
//            }else{
//            
//            //Se confirma si el perro esta en la lista
//            System.out.println("El perro esta en la lista");
//            
//            //Mostramos al usuario si el perro seleccionado ya está adoptado
//            if(perroAdoptado.isAdoptado()){
//                  System.out.println("Este perro esta actualmente adoptado");
//            }else{
//                  //Si el perro esta disponible para adopcion se adopta
//                  System.out.println("Bienvenido a su nueva casa" + nombre);
//                  //Se setea el perro como ADOPTADO en la lista de perros
//                  perroAdoptado.setAdoptado(true);
//                  //Se agrega el perro a la lista de perros del usuario
//                  persona.getPerrosAdoptado().add(perroAdoptado);                    
//                }
//            }           
//        }       
//    }    

