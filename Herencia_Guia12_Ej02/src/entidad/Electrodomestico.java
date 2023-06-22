
package entidad;

import java.util.Scanner;

/** Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:

• Un constructor vacío.

• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:

• Métodos getters y setters de todos los atributos.
 * 
 *
 * @author Pablo Demartini
 */
public class Electrodomestico {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 0;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
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

    public char getconsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setconsumoEnergetico(char consumoEnergetico) {
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
        return "Electrodomestico{" + "leer=" + leer + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    public char comprobarConsumoEnergetico(char letra) {
        // Verificar si la letra es correcta
        if (letra >= 'A' && letra <='F') {
            return letra;           
        }else{
            return 'F';
        }
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
        precio = leer.nextDouble();
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
                           Precio = """ + precio + "\nColor = " + color + "\nConsumo Energetico = " + consumoEnergetico + "\nPeso=" + peso+"\n");       
        
    }
    
    public double precioFinal(){
        double precioFinal = precio;
//        Calculo del precio final por consumo energetico.
   
    switch (consumoEnergetico) {
            case 'A' -> precioFinal += 1000;
            case 'B' -> precioFinal += 800;
            case 'C' -> precioFinal += 600;
            case 'D' -> precioFinal += 500;
            case 'E' -> precioFinal += 300;
            case 'F' -> precioFinal += 100;
        }

        if(peso >= 0 && peso <20){
            precioFinal +=100;
        }else if(peso >= 20 && peso <50){
            precioFinal +=500;
        }else if(peso >=50 && peso <80){
            precioFinal +=800;
        }else if(peso >=80){
            precioFinal +=1000;
        }
        
        return precioFinal;
    }
    
}
