package com.GJAV.x00118618;

import java.util.ArrayList;

public class Empresa extends Empleado { ;

    public Empresa(String nombre, String puesto, double salario) {
        super(nombre, puesto, salario);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
