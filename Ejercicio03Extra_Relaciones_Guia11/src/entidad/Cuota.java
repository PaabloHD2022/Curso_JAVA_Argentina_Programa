
package entidad;

import java.time.LocalDate;

/**
 *
 * @author Pablo Demartini
 */
public class Cuota {
    
    private int numeroCuota;
    private double montoTotal;
    private boolean pagada;
    private LocalDate fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoTotal, boolean pagada, LocalDate fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoTotal=" + montoTotal + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
}
