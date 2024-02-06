package PagoEmpleado;

public class Pago {

    private int codEmpleado;
    private double salarioBasico;
    private double horasExtras;
    private int numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    private double bonificacion;
    private double neto;
    public Pago(){}
    public Pago(int codEmpleado, double salarioBasico, double horasExtras, int numeroHoras, double descuento, double descuentoPrestamo, double bonificacion) {
        this.codEmpleado = codEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtras = horasExtras;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.descuentoPrestamo = descuentoPrestamo;
        this.bonificacion = bonificacion;
        calcularNeto();
    }

    public void calcularValorHE() {
        double valorHora = salarioBasico / (30 * 8);
        horasExtras = numeroHoras * valorHora * 1.5;
    }

    public double calcularDevengado() {
        return salarioBasico + horasExtras + bonificacion;
    }

    public double calcularDeducido() {
        return descuento + descuentoPrestamo;
    }

    public void calcularNeto() {
        neto = calcularDevengado() - calcularDeducido();
    }

    // Métodos getter y setter para los atributos privados
    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
}