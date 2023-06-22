
package entidad;

import java.util.Random;

/**Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

Métodos:

• 1 - llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
      Los valores deben ser aleatorios.
• 2 - mojar(): devuelve true si la posición del agua coincide con la posición actual
• 3 - siguienteChorro(): cambia a la siguiente posición del tambor
• 4 - toString(): muestra información del revolver (posición actual y donde está el agua)
 *
 * @author Pablo Demartini
 */
public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver(){
        //Generador de numeros aleatoreos. 
        Random random = new Random();
        posicionActual = random.nextInt(6);
        posicionAgua = random.nextInt(6);

          //Otro forma de generar numeros aleatoreos.
          
//        System.out.println("Posicion actual del revolver");
//        for (int i = 0; i < 1; i++) {
//            int posicionActual = (int) (Math.floor(Math.random()*6+1));
//        } 
        
//        System.out.println("Posicion actual del agua");
//        for (int i = 0; i < 1; i++) {
//            int posicionAgua = (int) (Math.floor(Math.random()*6+1));
//        }     
    }
    
    public boolean mojar(){
        return posicionActual == posicionAgua;            
    }
    
    public void siguienteChorro(){        
                
        /*Este código de Java define un método llamado siguienteChorro() que realiza dos acciones:
        Imprime en la consola el mensaje "Nueva posición del tambor del revolver".
        Actualiza la posición actual del tambor del revolver. La posición actual se incrementa en 1 
        y luego se calcula el residuo de la división entre 6. Esto asegura que la posición actual 
        siempre esté entre 0 y 5, inclusive. Si la posición actual es 5 y se llama a siguienteChorro(), 
        la posición actual se establecerá en 0.
        Este método se utiliza para avanzar la posición del tambor del revolver en el juego. 
        Cada vez que se llama a este método, la posición actual se incrementa y se cicla de vuelta
        al principio cuando se llega al final del tambor.*/
        
        System.out.println("Nueva posicion del tambor del revolver");
        posicionActual = (posicionActual + 1) % 6;       
    }    
}
