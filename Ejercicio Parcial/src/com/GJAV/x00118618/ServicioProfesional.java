package com.GJAV.x00118618;

public class ServicioProfesional extends Empleado{
    private int mesesContrato;
    private int dui;

    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato, int dui) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
        this.dui = dui;
    }

    public int getDui() {
        return dui;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }


    @Override
    public String toString() {
        return
                "Nombre= " + nombre + "\n"+
                "Puesto= " + puesto + "\n"+
                "Meses de contrato = " + mesesContrato +"\n"+
                "Dui= " + dui + "\n"+
                "Salario= " + salario +"$"+
                '\n';
    }
}
