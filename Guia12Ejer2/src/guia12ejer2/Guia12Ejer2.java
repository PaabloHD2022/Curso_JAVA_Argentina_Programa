/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejer2;

import guia12ejer2.entidad.Lavadora;
import guia12ejer2.entidad.Televisor;


public class Guia12Ejer2 {

    public static void main(String[] args) {
    Lavadora lava1= new Lavadora();
    Televisor tele1= new Televisor();
     
        lava1.crearLavadora();
        System.out.println("El precio final de la lavadora es de "+ lava1.precioFinal());
        
        
        tele1.crearTelevisor();
        System.out.println("El precio final del televisor es de " + tele1.precioFinal());
        
        
    }
    
}
