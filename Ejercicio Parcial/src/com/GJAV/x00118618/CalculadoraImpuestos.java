package com.GJAV.x00118618;

public class CalculadoraImpuestos extends Empleado{
    double totalRenta;
    double totalISSS;
    double totalAFP;

    public CalculadoraImpuestos(String nombre, String puesto, double salario, double totalRenta, double totalISSS, double totalAFP) {
        super(nombre, puesto, salario);
        this.totalRenta = totalRenta;
        this.totalISSS = totalISSS;
        this.totalAFP = totalAFP;
    }

    public double getTotalRenta() {
        return totalRenta;
    }

    public void setTotalRenta(double totalRenta) {
        this.totalRenta = totalRenta;
    }

    public double getTotalISSS() {
        return totalISSS;
    }

    public void setTotalISSS(double totalISSS) {
        this.totalISSS = totalISSS;
    }

    public double getTotalAFP() {
        return totalAFP;
    }

    public void setTotalAFP(double totalAFP) {
        this.totalAFP = totalAFP;
    }

    @Override
    public String toString() {
        return "CalculadoraImpuestos{" +
                "totalRenta=" + totalRenta +
                ", totalISSS=" + totalISSS +
                ", totalAFP=" + totalAFP +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
