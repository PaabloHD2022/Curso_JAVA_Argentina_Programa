package Entidades;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicios {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Poliza> polizas = new ArrayList();
    ArrayList<Cuotas> cuotas = new ArrayList();
   
    String celeste = "\033[36m";
    String verde = "\033[32m";
    String amarillo = "\033[33m";
    
    public void cargarClientes() {
        
        System.out.println(celeste+"Ingrese los siguientes datos del cliente.");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        System.out.println("DNI: ");
        long dni = leer.nextLong();
        System.out.println("Mail: ");
        String mail = leer.next();
        System.out.println("Domicilio: ");
        String domicilio = leer.next();
        System.out.println("Teléfono: ");
        long telefono = leer.nextLong();
        
        Cliente c = new Cliente(nombre,apellido,dni,mail,domicilio,telefono);
        
        clientes.add(c);
        System.out.println(celeste+"Cliente registrado correctamente.");
        
    }
    
    public void cargarVehiculo(){

        System.out.println(celeste+"Ingrese los siguientes datos del vehículo.");
        System.out.println("Marca: ");
        String marca = leer.next();
        System.out.println("Modelo: ");
        String modelo = leer.next();
        System.out.println("Año: ");
        int anio = Integer.parseInt(leer.next());
        System.out.println("Nro. motor: ");
        String nroMotor = leer.next();
        System.out.println("Nro. chasis: ");
        String nroChasis = leer.next();
        System.out.println("Color: ");
        String color = leer.next();
        System.out.println("Tipo (Admitidos: " + Tipo.AUTO + ", " + Tipo.SUV + ", " + Tipo.CAMIONETA + ".): ");
        String tipo = leer.next().toUpperCase();
        
        Vehiculo v = new Vehiculo(marca,modelo,anio,nroMotor,nroChasis,color,Tipo.valueOf(tipo));
        
        vehiculos.add(v);
        System.out.println(celeste+"Vehículo registrado correctamente.");
        
    }
    
    //c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
    //vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
    //póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
    //asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
    //terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
    //relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
    //muchos a uno o de muchos a muchos.
    
    public void crearPoliza() throws ParseException{
            
        boolean incluyeGranizo = false;
        double montoMax = 0;
        
        System.out.println(celeste+"Ingrese los siguientes datos de la póliza: ");
        System.out.println("Número: ");
        int nroPoliza = leer.nextInt();
        System.out.println("Fecha de inicio (DD/MM/AAAA): ");
        String fechaInicioStr = leer.next();
        Date fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicioStr);
        System.out.println("Fecha de finalización (DD/MM/AAAA): ");
        String fechaFinStr = leer.next();
        Date fechaFin = new SimpleDateFormat("dd/MM/yyyy").parse(fechaFinStr);
        System.out.println("Cantidad de cuotas: ");
        int cantCuotas = leer.nextInt();
        System.out.println("Forma de pago (Admitidos: " + FormaPago.CONTADO + ", " + FormaPago.CREDITO + ", " 
                 + FormaPago.TRANSFERENCIA + FormaPago.CUOTAS + FormaPago.DEBITO_AUTOMATICO + FormaPago.EFECTIVO + ".): ");
        String formaPago = leer.next().toUpperCase();
        System.out.println("Monto total asegurado: ");
        double montoTotal = leer.nextDouble();
        System.out.println("¿Incluye granizo? S/N");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("S")) {
            System.out.println("Monto máximo por granizo: ");
            montoMax = leer.nextDouble();
            incluyeGranizo = true;
        }
        System.out.println("Tipo de cobertura (Admitidos: " + Cobertura.TERCEROS + ", " + Cobertura.TERCERO_CON_GRANIZO 
                + ", " + Cobertura.TODO_RIESGO + "): ");
        String cobertura = leer.next().toUpperCase();

        System.out.print("Seleccione un cliente (por número de documento):");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println((i + 1) + ". " + cliente.getDni() + " - " + cliente.getNombre());
        }
        
        int clienteIndex = leer.nextInt() - 1;
        Cliente cliente = clientes.get(clienteIndex);
        
        System.out.print("Seleccione un vehículo (por nro. de chasis):");
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println((i + 1) + ". " + vehiculo.getChasis() + " - " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
        
        int vehiculoIndex = leer.nextInt() - 1;
        Vehiculo vehiculo = vehiculos.get(vehiculoIndex);
        
        Poliza p = new Poliza(nroPoliza,fechaInicio,fechaFin,cantCuotas,FormaPago.valueOf(formaPago),montoTotal,incluyeGranizo,montoMax,Cobertura.valueOf(cobertura),cliente,vehiculo);
        
        polizas.add(p);
        System.out.println(celeste+"Póliza registrada correctamente.");
        
        System.out.println(polizas);
        
    }
    
    //d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
    //Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
    //cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
    //etc.).
    
    public void gestionCuotas(){
        
        System.out.print("Seleccione una póliza (por número):");
        
        for (int i = 0; i < polizas.size(); i++) {
            Poliza poliza = polizas.get(i);
            System.out.println((i + 1) + ". " + poliza.getNroPoliza() + " - " + poliza.getCliente().getNombre() + " " + poliza.getCliente().getApellido());
        }
        
        int numeroCuotaActual = 0;
        int pIndex = leer.nextInt();
        Date fechaVenc = new Date();
        boolean pagado = false;
        
        Poliza poliza = polizas.get(pIndex);
        
        int nroCuota = 0;
        double montoCuota = poliza.getMontoTotalAsegurado() / poliza.getCantCuotas();
        
        System.out.printf("%-3s %-15s %-5s %-15s %-10s","Nro. Cuota","Monto Cuota","Pago","Fecha Vencimiento","Forma de Pago");
        System.out.printf("%-3s %-15s %-5s %-15s %-10s",nroCuota,montoCuota,pagado,fechaVenc,poliza.getFormapago());
        
    }
    
 
    
    public void listarClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.print((i + 1) + ". " + cliente.getNombre() + " " + cliente.getApellido());
        }
    }

    public void listarVehiculos() {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.print((i + 1) + ". " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
    }
    
}
