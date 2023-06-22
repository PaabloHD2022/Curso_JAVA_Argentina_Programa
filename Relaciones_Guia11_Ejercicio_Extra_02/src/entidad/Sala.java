
package entidad;

import java.util.Random;

/**
 *
 * @author Pablo Demartini
 */
public class Sala {
    
    private Pelicula pelicula;
    public char [][] asientos;
    private double precioEntrada;

    public Sala() {
    }

    public Sala(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.asientos = asientos;
        this.precioEntrada = precioEntrada;
        asientos = new char[8][6];
        inicializarSala();
    }
    //Creamos la sala con sus asientos vacios.
    private void inicializarSala(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = ' '; 
            }            
        }
    }
    
    public void mostrarSala(){
        
    System.out.println("-------------------------------------------------");
    System.out.println("* Información de sala: *"); 
    System.out.println("-------------------------------------------------");
    
    for (int i = 7; i >= 0; i--) {
        for (int j = 0; j < 6; j++) {
            if (asientos[i][j] == ' ') {
                System.out.print("| " + String.format("%5s", (i + 1) + " " + (char) ('A' + j)) + " ");
            } else {
                System.out.print("| " + String.format("%5s", asientos[i][j]) + " ");
            }
        }
        System.out.println("|");
    }
    
    System.out.println("-------------------------------------------------");
    System.out.println("X => Asientos ocupados");
    System.out.println("-------------------------------------------------");
        
    }

    public void venderEntrada(Espectador espectador) {
        //Si la edad del espectador es igual o mayor que la edad minima y si tiene el dinero necesario se vende la entrada 
        
        if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDineroDisponible() >= precioEntrada) {
            //Aleatoreamente se le asigna un asiento
            Random random = new Random();
            int fila = random.nextInt(8);
            int columna = random.nextInt(6);
            //Si el asiento seleccionado esta vacio se le asigna al espectador y se deja marcado con una "X" y se le informa ubicacion.
            if (asientos[fila][columna] == ' ') {
                asientos[fila][columna] = 'X';
                System.out.println(espectador.getNombre() + " ha comprado una entrada para la fila " + (fila + 1) + ", columna " + (columna + 1));
            } else {
                System.out.println(espectador.getNombre() + " no ha podido comprar una entrada");
            }
        } else {
            System.out.println(espectador.getNombre() + " no cumple con los requisitos para ver la película");
        }
    }
}
