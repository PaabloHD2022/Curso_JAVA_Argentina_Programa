/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejer2.entidad;

import java.util.Scanner;

/**
 *
 * @author eglys
 */
public class Lavadora extends Electrodomestico{
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }    

    public void crearLavadora(){
        crearElectrodomestico();        
        System.out.println("Ingrese la carga");
        carga = leer.nextInt();       
    }
    
@Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (carga > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }   
    
}
