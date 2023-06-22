/** @author kary2 */

/* Nos piden hacer un programa sobre un Cine, que tiene una sala con un 
conjunto de asientos (8 filas por 6 columnas). De Cine nos interesa conocer la 
película que se está reproduciendo, la sala con los espectadores y el precio de 
la entrada. Luego, de las películas nos interesa saber el título, duración, 
edad mínima y director. Por último, del espectador, nos interesa saber su 
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. 
Los asientos son etiquetados por una letra y un número la fila A1 empieza al 
final del mapa como se muestra en la tabla. También deberemos saber si el 
asiento está ocupado por un espectador o no, si esta ocupado se muestra una X, 
sino un espacio vacío.

8 A X  | 8 B X  | 8 C X  | 8 D    | 8 E X  | 8 F X
7 A X  | 7 B X  | 7 C X  | 7 D X  | 7 E    | 7 F X
6 A    | 6 B X  | 6 C    | 6 D X  | 6 E X  | 6 F
5 A X  | 5 B    | 5 C X  | 5 D X  | 5 E X  | 5 F X
4 A X  | 4 B X  | 4 C X  | 4 D X  | 4 E X  | 4 F X
3 A    | 3 B X  | 3 C X  | 3 D    | 3 E X  | 3 F X
2 A X  | 2 B    | 2 C X  | 2 D X  | 2 E X  | 2 F
1 A X  | 1 B X  | 1 C X  | 1 D X  | 1 E X  | 1 F X

Asientos vacios: 6A; 3A; 5B; 2B; 6C; 8D; 3D; 7E; 6F; 2F

Se debe realizar una pequeña simulación, en la que se generen muchos 
espectadores y se los ubique en los asientos aleatoriamente (no se puede ubicar
un espectador donde ya este ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta 
que sólo se podrá sentar a un espectador si tiene el dinero suficiente para 
pagar la entrada, si hay espacio libre en la sala y si tiene la edad requerida 
para ver la película. En caso de que el asiento este ocupado se le debe buscar 
uno libre. Al final del programa deberemos mostrar la tabla, podemos mostrarla 
con la letra y numero de cada asiento o solo las X y espacios vacíos. */

package guia_11_rec_x02;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;

public class Guia_11_REC_X02 {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Jurassic Park", 127, 13, "Steven Spielberg");
        Cine cine = new Cine(pelicula, 500.0);

        System.out.println("----- CINE -----");
        System.out.println("* Información de la película: *");
        System.out.println(pelicula.toString());

        System.out.println();  
        System.out.println("* Información de espectadores: *");        
        Espectador espectador1 = new Espectador("Kary", 35, 1000.0);
        Espectador espectador2 = new Espectador("María", 15, 200.0);
        Espectador espectador3 = new Espectador("Pedro", 30, 800.0);
        Espectador espectador4 = new Espectador("Ana", 12, 300.0);
        Espectador espectador5 = new Espectador("Luis", 18, 500.0);
        Espectador espectador6 = new Espectador("Laura", 25, 400.0);
        Espectador espectador7 = new Espectador("Pablo", 16, 600.0);
        Espectador espectador8 = new Espectador("Luciana", 14, 200.0);
        Espectador espectador9 = new Espectador("Javier", 22, 900.0);
        Espectador espectador10 = new Espectador("Sofía", 17, 700.0);

        cine.venderEntrada(espectador1);
        cine.venderEntrada(espectador2);
        cine.venderEntrada(espectador3);
        cine.venderEntrada(espectador4);
        cine.venderEntrada(espectador5);
        cine.venderEntrada(espectador6);
        cine.venderEntrada(espectador7);
        cine.venderEntrada(espectador8);
        cine.venderEntrada(espectador9);
        cine.venderEntrada(espectador10);

        cine.mostrarSala();
    }
}
