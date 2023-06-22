
package entidad;

import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Electrodomestico {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    protected double precioElectrodomestico;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioElectrodomestico, String color, char consumoEnergetico, double peso) {
        this.precioElectrodomestico = precioElectrodomestico;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioElectrodomestico() {
        return precioElectrodomestico;
    }

    public void setPrecioElectrodomestico(double precioElectrodomestico) {
        this.precioElectrodomestico = precioElectrodomestico;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioElectrodomestico=" + precioElectrodomestico + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    public void comprobarConsumoEnergetico(char letra) {
        // Verificar si la letra es correcta
        if (letra < 'A' && letra >'F') {
            consumoEnergetico = 'F';
        } 
        System.out.println("Consumo Energetico = " + consumoEnergetico);   
    }
    
    
    public String comprobarColor(String color) {
        // Verificar si el color es correcto
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        
        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                return colorDisponible;
            }            
        }
        return "blanco";        
    }
    
    public void crearElectrodomestico(){
        
        System.out.println("Ingrese el precio: ");
        precioElectrodomestico = leer.nextDouble();
        System.out.println("Ingrese el color: ");
        color = leer.next();
        color = comprobarColor(color);
        System.out.println("Ingrese el consumo energetico: ");
        consumoEnergetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese el peso: ");
        peso = leer.nextDouble();
        System.out.println("""
                           Electrodomestico => 
                           Precio = """ + precioElectrodomestico + "\nColor = " + color + "\nConsumo Energetico = " + consumoEnergetico + "\nPeso=" + peso+"\n");       
        
    }
    
    public double precioPorConsumo(){
        double precioPorConsumo = this.precioElectrodomestico;
//        Calculo del precio final por consumo energetico.
   
    switch (consumoEnergetico) {
            case 'A' -> precioElectrodomestico += 1000;
            case 'B' -> precioElectrodomestico += 800;
            case 'C' -> precioElectrodomestico += 600;
            case 'D' -> precioElectrodomestico += 500;
            case 'E' -> precioElectrodomestico += 300;
            case 'F' -> precioElectrodomestico += 100;
        }      
        
        return precioPorConsumo;
    }
    
    public double precioPorPeso(){
        //Calculo del precio final por el peso.             
        double precioPorPeso = this.precioElectrodomestico;
        if(peso >= 0 && peso <20){
            precioElectrodomestico +=100;
        }else if(peso >= 20 && peso <50){
            precioElectrodomestico +=500;
        }else if(peso >=50 && peso <80){
            precioElectrodomestico +=800;
        }else if(peso >=80){
            precioElectrodomestico +=1000;
        }
        
        return precioPorPeso;
    }
    
    public double precioFinal(){
        double precioFinal = this.precioElectrodomestico;
        precioFinal = (this.precioPorConsumo()) +( this.precioPorPeso());        
        
        return precioFinal;
    }
    
}
