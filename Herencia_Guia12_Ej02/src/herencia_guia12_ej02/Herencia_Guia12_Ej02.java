
package herencia_guia12_ej02;

import entidad.Lavadora;
import entidad.Televisor;


/* Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:

• Un constructor vacío.

• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:

• Métodos getters y setters de todos los atributos.

• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO        PESO PRECIO
A $1000             Entre 1 y 19 Kg $100
B $800              Entre 20 y 49 kg $500
C $600              Entre 50 y 79 kg $800
D $500              Mayor que 80 kg $1000
E $300
F $100

A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.

Los constructores que se implementarán serán:

• Un constructor vacío.

• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:

• Método get y set del atributo carga.

• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.

• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.

Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.

Los constructores que se implementarán serán:

• Un constructor vacío.

• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:

• Método get y set de los atributos resolución y sintonizador TDT.

• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.

• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.

Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 *
 * @author Pablo Demartini
 */
public class Herencia_Guia12_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Lavadora lav1 = new Lavadora (5, 10000,"violeta",'A',70);
//        Lavadora lav2 = new Lavadora (10, 10000,"celeste",'B',70);
//        
//        Televisor tv1 = new Televisor(55,true,10000, "violeta",'A',10);
//        Televisor tv2 = new Televisor(24,true,10000, "negro",'B',5);
//        Televisor tv3 = new Televisor(24,false,10000, "negro",'B',5);

        Lavadora lav1 = new Lavadora();
        Televisor tv1 = new Televisor();
        
        lav1.crearLavadora();
        System.out.println("El precio de la lavadora es de: $:" + lav1.precioFinal());
        
        tv1.crearTelevisor();
        System.out.println("El precio del televisor es de $:" + tv1.precioFinal());
        
//        
//        String amarillo = "\033[33m";
//        System.out.println("Electrodomestico - Lavadora 1");
//        System.out.println("----------------");
//        System.out.println(lav1.toString());        
//        lav1.comprobarConsumoEnergetico(lav1.getconsumoEnergetico());        
//        System.out.println("Precio Final: "+lav1.precioFinal());
//        System.out.println(amarillo+".......................");
       
//        System.out.println("Electrodomestico - Lavadora 2");
//        System.out.println("----------------");
//        System.out.println(lav2.toString());
//        lav2.comprobarConsumoEnergetico(lav2.getconsumoEnergetico());
//        System.out.println("Precio Final: "+lav2.precioFinal());
//        System.out.println(amarillo+".......................");
        
//        System.out.println("Electrodomestico - TV 1");
//        System.out.println("----------------");
//        System.out.println(tv1.toString());
//        tv1.comprobarConsumoEnergetico(tv1.getconsumoEnergetico());
//        System.out.println("Precio Final: "+tv1.precioFinal());
//        System.out.println(amarillo+".......................");
        
//        System.out.println("Electrodomestico - TV 2");
//        System.out.println("----------------");
//        System.out.println(tv2.toString());
//        tv2.comprobarConsumoEnergetico(tv2.getconsumoEnergetico());
//        System.out.println("Precio Final: "+tv2.precioFinal());
//        System.out.println(amarillo+".......................");
//        
//        System.out.println("Electrodomestico - TV 3");
//        System.out.println("----------------");
//        System.out.println(tv3.toString());
//        tv3.comprobarConsumoEnergetico(tv3.getconsumoEnergetico());
//        System.out.println("Precio Final: "+tv3.precioFinal());
//        System.out.println(amarillo+".......................");

            


    } 
    
}
