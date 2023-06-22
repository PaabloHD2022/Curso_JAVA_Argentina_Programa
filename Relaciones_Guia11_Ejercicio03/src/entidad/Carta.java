
package entidad;

import java.util.List;

/**Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 
* 
* Esta clase debe contener 
* un método toString() que retorne el número de carta y el palo. 


 *
 * @author Pablo Demartini
 */
public class Carta {
    
    //Atributos
    private int numero;
    private String palo;
    
    //Constantes
    public static final String[] PALOS={"ESPADAS", "OROS", "COPAS", "BASTOS"};
    public static final int LIMITE_CARTA_PALO=12;

    //Constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
    
}

