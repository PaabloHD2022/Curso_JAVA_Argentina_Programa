
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorvotos;

import entidades.Alumnos;
import entidades.Simulador;
import entidades.Voto;

/**
 *
 * @author Angel
 */
public class SimuladorVotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simulador simular = new Simulador();
        Alumnos alumno = new Alumnos();
        Voto voto = new Voto();
        
        simular.mostrarListaAlumnos(alumno);
//        simular.mostrarVotados(voto, alumno);
    }
    
}
