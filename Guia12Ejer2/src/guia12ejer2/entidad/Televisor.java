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
public class Televisor extends Electrodomestico{
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    protected int resolucion;
    protected boolean tdt;

    public Televisor() {
        this.tdt=false;
    }

    public Televisor(int resolucion, boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor(int resolucion, boolean tdt, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }
    
    
    public void crearTelevisor(){
        
        crearElectrodomestico();
        
        System.out.println("Ingrese la resolución");
        resolucion = leer.nextInt();        
        System.out.println("Quiere con TDT? S/N");
        
        if ("s".equalsIgnoreCase(leer.next())) {
             tdt=true;
        }   
    }    
   
    @Override
    public double precioFinal(){
        
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal *= 1.3;
        }

        if (tdt) {
            precioFinal += 500;
        }
        return precioFinal;
    }
    
}
