
package entidad;

import enums.FormaPago;
import java.util.Date;

/**
 *
 * @author Pablo Demartini
 */
public class Cuota {
    
    private int numeroCuota;
    double montoCuota;
    boolean pagado;
    private Date fechaVencimiento;
    private FormaPago formaPago;

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoCuota, boolean pagado, Date fechaVencimiento, FormaPago formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoCuota = montoCuota;
        this.pagado = pagado;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoCuota=" + montoCuota + ", pagado=" + pagado + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
}
