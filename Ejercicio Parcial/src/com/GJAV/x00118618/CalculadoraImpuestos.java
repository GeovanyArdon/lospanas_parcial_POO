package com.GJAV.x00118618;

public class CalculadoraImpuestos extends Empleado{
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;

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



    public static double pago(Empleado posiciona){
        double restante=0, x = 0, pago = 0, renta;
        if(posiciona instanceof PlazaFija){
            totalAFP=posiciona.salario*0.0625;
            totalISSS=posiciona.salario*0.03;
            restante = posiciona.salario-totalISSS-totalAFP;
            x = restante;
            if (x <= 472){
                posiciona.salario=x;
            }
            else if (x>472.01 && x<=895.24){
                totalRenta = 0.1*(x-472)+17.67;
            }
            else if (x>895.25 && x<2038.10){
                totalRenta = 0.2*(x-895.24)+60;
            }
            else if(x>=2038.11){
                totalRenta = 0.3*(x-2038.10)+288.57;
            }
            pago = restante-totalRenta;
        }
        else if (posiciona instanceof ServicioProfesional){
            renta = 0.1*posiciona.salario;
            totalRenta = renta+totalRenta;
            pago = posiciona.salario-totalRenta;
        }
        return pago;
    }

    public static String mostrarTotales(){
        return "Total Renta: " + totalRenta + ", Total AFP: " + totalAFP+ ", Total ISSS: " + totalISSS;
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



