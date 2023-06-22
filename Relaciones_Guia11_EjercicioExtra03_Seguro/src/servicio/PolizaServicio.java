 
package servicio;

import entidad.Poliza;
import enums.FormaPago;
import enums.TipoCobertura;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.

a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.

b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).

c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente.

Los datos incluidos en ella son: número de póliza, fecha de inicio y fin de la póliza, 
cantidad de cuotas, forma de pago, monto total asegurado, incluye granizo, monto máximo granizo,
tipo de cobertura (total, contra terceros, etc.). 

Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.

d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).

Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 *
 * @author Pablo Demartini
 */
public class PolizaServicio {
    
    public Poliza contratarSeguro(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicio ps = new PersonaServicio();
        VehiculoServicio vs = new VehiculoServicio();
        Poliza poliza = new Poliza();
        poliza.setPersona(ps.registrarPersona());
        poliza.setVehiculo(vs.registrarVehiculo());        
        System.out.println("Ingrese el numero de poliza");
        poliza.setNumeroPoliza(leer.nextInt());       
        
        //Fecha inicial con LocalDate
        System.out.print("Ingrese fecha inicio de la poliza (dd/MM/yyyy)");
        String fechaStr = leer.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicio = LocalDate.parse(fechaStr, formatter);
        poliza.setFechaInicio(fechaInicio);
        
        //Fecha final con LocalDate  
        System.out.print("Ingrese fecha finalizacion de la poliza (dd/MM/yyyy)");
        String fechaFinalStr = leer.next();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaFinal = LocalDate.parse(fechaFinalStr, formatter2);
        poliza.setFechafinPoliza(fechaFinal);
        
        System.out.println("Ingrese cantidad de cuotas de la poliza");
        poliza.setCantidadCuotas(leer.nextInt());
        
        System.out.println("Ingrese el metodo de pago de la poliza");
        System.out.println("1 - EFECTIVO");
        System.out.println("2 - TRANSFERENCIA");
        System.out.println("3 - TARJETA");
        System.out.println("4 - DEBITO AUTOMATICO");
        int pago = leer.nextInt();
        poliza.setPago(FormaPago.values()[pago-1]);        
        
        System.out.println("Ingrese el monto total");
        poliza.setMontoTotal(leer.nextInt());
        System.out.println("¿Cubre granizo?(S/N)");
        poliza.setGranizo(false);
        if(leer.next().charAt(0) == 'S'){
            poliza.setGranizo(true);
            if(poliza.isGranizo()){
                System.out.println("Ingrese el monto del granizo");
                poliza.setMontoGranizo(leer.nextDouble());
            }        
        }
        
        System.out.println("Seleccione el tipo de cobertura");
        System.out.println("1 - RESPONSAVILIDAD CIVIL");
        System.out.println("2 - TERCEROS PERDIDA TOTAL");
        System.out.println("3 - TERCEROS PERDIDA TOTAL O PARCIAL");
        System.out.println("4 - TODO RIESGO");
        int cobertura = leer.nextInt();
        poliza.setTipoCobertura(TipoCobertura.values()[cobertura-1]);        
        
        return poliza;        
    }
}
