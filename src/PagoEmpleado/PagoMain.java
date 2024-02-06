package PagoEmpleado;

import javax.swing.*;

public class PagoMain {
    public static void main(String[] args) {
        Pago pago = new Pago();
        String valorHE = JOptionPane.showInputDialog("Ingrese el valor de las horas extras:");
        pago.setHorasExtras(Double.parseDouble(valorHE));
        pago.calcularValorHE();

        String devengado = JOptionPane.showInputDialog("Ingrese el valor devengado:");
        pago.setSalarioBasico(Double.parseDouble(devengado));

        String deducido = JOptionPane.showInputDialog("Ingrese el valor deducido:");
        pago.setDescuento(Double.parseDouble(deducido));

        String neto = JOptionPane.showInputDialog("Ingrese el valor neto:");
        pago.setNeto(Double.parseDouble(neto));
        pago.calcularNeto();

        JOptionPane.showMessageDialog(null, "Datos ingresados:\nValor HE: " + pago.getHorasExtras() +
                "\nDevengado: " + pago.getSalarioBasico() + "\nDeducido: " + pago.getDescuento() + "\nNeto: " + pago.getNeto());
    }
}