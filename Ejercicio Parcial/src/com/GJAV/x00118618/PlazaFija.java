package com.GJAV.x00118618;

public class PlazaFija extends Empleado {
    private int extension;
    private int dui2;

    public PlazaFija(String nombre, String puesto, double salario, int extension, int dui2) {
        super(nombre, puesto, salario);
        this.extension = extension;
        this.dui2 = dui2;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getDui2() {
        return dui2;
    }

    @Override
    public String toString() {
        return
                        "Nombre= " + nombre + "\n"+
                        "Puesto= " + puesto + "\n"+
                        "Extension= " + extension +"\n"+
                        "Dui= " + dui2 + "\n"+
                        "Salario= " + salario +"$"+
                        '\n';
    }
}
