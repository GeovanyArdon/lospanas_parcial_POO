package com.GJAV.x00118618;

import java.util.ArrayList;

public class Empresa extends Empleado { ;
    private ArrayList<Empresa> empleado;

    public Empresa(String nombre, String puesto, double salario,String empleado) {
        super(nombre, puesto, salario);
    }

    public ArrayList<Empresa> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empresa> empleado) {
        this.empleado = empleado;
    }
}
