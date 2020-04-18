package com.GJAV.x00118618;

public class ServicioProfesional extends Empleado{
    int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario,int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    @Override
    public String toString() {
        return "ServicioProfesional{" +
                "mesesContrato=" + mesesContrato +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}