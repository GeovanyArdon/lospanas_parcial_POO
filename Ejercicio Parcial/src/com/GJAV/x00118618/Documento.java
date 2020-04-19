package com.GJAV.x00118618;

import java.util.ArrayList;

public class Documento extends Empleado{

    private String numero;
    private ArrayList<Documento> documentos;

    public Documento(String nombre, String puesto, double salario, String numero) {
        super(nombre, puesto, salario);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}





