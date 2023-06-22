
package entidad;

import enums.FormaPago;
import enums.TipoCobertura;
import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author Pablo Demartini
 */
public class Poliza {
    
    private Vehiculo vehiculo;
    private Persona persona;
    private int numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFinPoliza;
    private int cantidadCuotas;
    private FormaPago pago;
    double montoTotal;
    boolean granizo;
    private double montoGranizo;
    private TipoCobertura tipoCobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Persona persona, int numeroPoliza, LocalDate fechaInicio, LocalDate fechaFinPoliza, int cantidadCuotas, FormaPago pago, double montoTotal, boolean granizo, double montoGranizo, TipoCobertura tipoCobertura) {
        this.vehiculo = vehiculo;
        this.persona = persona;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinPoliza = fechaFinPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.pago = pago;
        this.montoTotal = montoTotal;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechafinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechafinPoliza(LocalDate fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public FormaPago getPago() {
        return pago;
    }

    public void setPago(FormaPago pago) {
        this.pago = pago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", persona=" + persona + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFinPoliza=" + fechaFinPoliza + ", cantidadCuotas=" + cantidadCuotas + ", pago=" + pago + ", montoTotal=" + montoTotal + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }     
    
}
