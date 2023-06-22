package Entidad;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja{

    ArrayList<Cartas> mazo = new ArrayList(); 
    ArrayList<Cartas> monton = new ArrayList();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void Baraja() {        

        String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int num = 1; num <= 12; num++) {
                if (num != 8 && num != 9) {
                    Cartas xx = new Cartas(num,palo);
                    mazo.add(xx);
                }
            }
        }     
    }

    public void barajar() {
    Collections.shuffle(mazo);
    //mostrarBaraja();
    }

    public void siguienteCarta() {
        if (mazo.size() > 0){    
            System.out.println("la siguiente carta es " + mazo.get(0)); 
        } else {
            System.out.println("No quedan mas cartas tigre!!!!");
        }    
    }

    public int cartasDisponibles() {
        
    return mazo.size();
    }

    public void darCartas() {
        System.out.println("Digame caballero ¿cuantas cartas desea?");
        int cant = sc.nextInt();
            if (mazo.size() < cant){
                System.out.println("No tengo mas cartas");
            } else {    
            for (int i = 0; i < cant; i++) {
            monton.add(mazo.get(i));
            mazo.remove(i);

            }  
        }       
    }
        
    public void cartasMonton() {
        System.out.println("--------------------------------------------------");
        for (Cartas carta : monton) {
            System.out.printf("%-2s %-2s %-6s", carta.getNum(), "de", carta.getPalo());
            System.out.println("");
        }
        System.out.println("--------------------------------------------------");   
    }

    public void mostrarBaraja() {
        System.out.println("--------------------------------------------------");
        for (Cartas carta : mazo) {
            System.out.printf("%-2s %-2s %-6s", carta.getNum(), "de", carta.getPalo());
            System.out.println("");
        }
        System.out.println("--------------------------------------------------");
    }   
}
