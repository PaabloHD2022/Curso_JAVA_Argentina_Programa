
package entidad;

import java.util.ArrayList;

/**
*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 
* 
* Esta clase debe contener 
* un método toString() que retorne el número de carta y el palo. 
* La baraja estará compuesta por un conjunto de cartas, 40 exactamente.

* Las operaciones que podrá realizar la baraja son:

* • barajar(): cambia de posición todas las cartas aleatoriamente.

* • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.

* • cartasDisponibles(): indica el número de cartas que aún se puede repartir.

* • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.

* • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario

* • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 *
 * @author Pablo Demartini
 */

public class Baraja {
    
    //Atributos
    private Carta cartas[];
    private int posSiguienteCarta;

    //Cartas
    public static final int NUM_CARTAS = 40;

    public Baraja() {
        this.cartas = new Carta[NUM_CARTAS];
        this.posSiguienteCarta = 0;
        crearBaraja(); //Creamos la baraja
        barajar(); // barajamos la baraja
    }

    /**
     * Crea la baraja ordenada
     */
    private void crearBaraja() {

        String[] palos = Carta.PALOS;

        //Recorro los palos
        for (int i = 0; i < palos.length; i++) {

            //Recorro los numeros
            for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++) {
                //Las posiciones del 8 y del 9 son el 7 y el 8 (emepzamos en 8)
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        //Solo para la sota, caballo y rey
                        cartas[((i * (Carta.LIMITE_CARTA_PALO - 2)) + (j - 2))] = new Carta(j + 1, palos[i]);
                    } else {
                        //Para los casos de 1 a 7
                        cartas[((i * (Carta.LIMITE_CARTA_PALO - 2)) + j)] = new Carta(j + 1, palos[i]);
                    }
                }
            }
        }
    }

    /**
     * Baraja todas las cartas
     */
    public void barajar() {

        int posAleatoria = 0;
        Carta c;

        //Recorro las cartas
        for (int i = 0; i < cartas.length; i++) {

            posAleatoria = Metodos.generaNumeroEnteroAleatorio(0, NUM_CARTAS - 1);

            //intercambio
            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;
        }

        //La posición vuelve al inicio
        this.posSiguienteCarta = 0;
    }

    /**
     * Devuelve la casta donde se encuentre "posSiguienteCarta"
     * @return carta del arreglo
     */
    public Carta siguienteCarta() {

        Carta c = null;

        if (posSiguienteCarta == NUM_CARTAS) {
            System.out.println("Ya no hay mas cartas, barajea de nuevo");
        } else {
            c = cartas[posSiguienteCarta++];
        }

        return c;
    }

    /**
     * Devuelve un numero de cartas. Controla si hay mas cartas de las que se piden 
     * @param numCartas
     * @return 
     */
    public Carta[] darCartas(int numCartas) {

        if (numCartas > NUM_CARTAS) {
            System.out.println("No se puede dar mas cartas de las que hay");
        } else if (cartasDisponible() < numCartas) {
            System.out.println("No hay suficientes cartas que mostrar");
        } else {

            Carta[] cartasDar = new Carta[numCartas];

            //recorro el array que acabo de crear para rellenarlo
            for (int i = 0; i < cartasDar.length; i++) {
                cartasDar[i] = siguienteCarta(); //uso el metodo anterior
            }
            
            //Lo devuelvo
            return cartasDar;
        }

        //solo en caso de error
        return null;
    }

    /**
     * Indica el numero de cartas que hay disponibles
     * @return 
     */
    public int cartasDisponible() {
        return NUM_CARTAS - posSiguienteCarta;
    }

    /**
     * Muestro las cartas que ya han salido
     */
    public void cartasMonton() {

        if (cartasDisponible() == NUM_CARTAS) {
            System.out.println("No se ha sacado ninguna carta");
        } else {
            //Recorro desde 0 a la posSiguienteCarta
            for (int i = 0; i < posSiguienteCarta; i++) {
                System.out.println(cartas[i]);
            }
        }
    }

    /**
     * Muestro las cartas que aun no han salido
     */
    public void mostrarBaraja() {

        if (cartasDisponible() == 0) {
            System.out.println("No hay cartas que mostrar");
        } else {
            for (int i = posSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i]);
            }
        }
    }    
}
