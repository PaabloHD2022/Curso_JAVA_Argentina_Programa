

package entidad;

import java.util.ArrayList;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver

Métodos:

• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
/*
 * 
 * @author Pablo Demartini
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    
    // Clase que representa el Juego de la ruleta rusa de agua
    // Relación de composición con las clases Jugador 
    //(conjunto de Jugadores) y RevolverAgua

    // Método para llenar el juego con jugadores y el revolver
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    // Método para simular una ronda del juego
    public void ronda() {
        for (Jugador jugador : jugadores) {
            if (jugador.disparo(revolver)) {
                System.out.println("¡" + jugador + " se ha mojado!");
                return;
            }
        }
    }    
}
