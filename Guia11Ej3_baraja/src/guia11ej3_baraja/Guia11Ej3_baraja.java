/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej3_baraja;
import Entidad.Baraja;
import java.util.Scanner;

/**
 *
 * @author Loscortes
 */
public class Guia11Ej3_baraja {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Baraja nn = new Baraja();
    int opc;
    
    nn.Baraja();
        
        do {
            System.out.println("1. Barajar.");
            System.out.println("2. Siguiente carta.");
            System.out.println("3. Dar cartas.");
            System.out.println("4. Mostrar montón.");
            System.out.println("5. Mostrar baraja.");
            System.out.println("6. Mostrar cartas disponibles.");
            System.out.println("7. Salir.");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    nn.barajar();
                    break;
                case 2:
                    nn.siguienteCarta();
                    break;
                case 3:
                    nn.darCartas();
                    break;
                case 4:
                    nn.cartasMonton();
                    break;
                case 5:
                    nn.mostrarBaraja();
                    break;
                case 6:
                    System.out.println("Cartas disponibles: " + nn.cartasDisponibles());
                    break;
                case 7:
                    System.out.println("Saludos.");
                    break;
                default:
                    System.out.println("La opción ingresada es inválida. Vuelva a intentarlo.");
            }
        } while (opc != 7);
    }    
}
