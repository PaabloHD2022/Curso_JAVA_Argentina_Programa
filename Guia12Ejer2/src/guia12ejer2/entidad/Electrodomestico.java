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
public class Electrodomestico {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "leer=" + leer + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    public char comprobarConsumoEnergetico(char letra){
     
    if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }   
 
    public String comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};

        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                return colorDisponible;
            }
        }
        
        return "blanco";
    }
    
    public void crearElectrodomestico(){
        System.out.println("Ingrese el precio:");
        precio = leer.nextDouble();
        System.out.println("Ingrese el color:");
        color = leer.next();
        System.out.println(comprobarColor(color));
        System.out.println("Ingrese el tipo de consumo:");
        consumoEnergetico = leer.next().charAt(0);
        System.out.println(comprobarConsumoEnergetico(consumoEnergetico));
        System.out.println("Ingrese el peso:");
        peso = leer.next().charAt(0);     
       
    }

    public double precioFinal() {
        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

    if (peso >= 1 && peso <= 19) {
        precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }
    
}

