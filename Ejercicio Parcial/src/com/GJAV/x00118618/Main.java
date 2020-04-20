package com.GJAV.x00118618;




import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        ArrayList<ServicioProfesional> empleadoTemporal = new ArrayList<>();
        ArrayList<PlazaFija> empleadoFijo = new ArrayList<>();


        String empresa = JOptionPane.showInputDialog(null,"Nombre de la empresa");
        int contador = 0;

        String empleados;
        Empresa emp = new Empresa(empresa);
        PlazaFija pf = null;
        ServicioProfesional sp = null;



        byte op = 0;

        String menu =
                "1. Agregar empleado\n" +
                        "2. Ver lista de empleado\n" +
                        "3. Despedir Empleado\n" +
                        "4. Calcular sueldo\n" +
                        "5. Mostrar totales\n" +
                        "6. Salir\n" ;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

            switch (op) {
                case 1:
                    String tipo = JOptionPane.showInputDialog(null,
                            "1- Servicio Profesional \n" +
                                    "2- Plaza Fija\n" +
                                    "Digite tipo: ");

                    switch (tipo) {

                        case "1":
                            String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                            String posicion = JOptionPane.showInputDialog(null, "Posicion: ");
                            double salario = 0;
                            try{
                                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));

                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico no caracteres");
                                break;
                            }


                            if(salario<0){
                                JOptionPane.showMessageDialog(null,"El salario no puede ser menor a (0.0$)");
                                break;
                            }
                            int meses = 0;

                            try{
                                meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contrato: "));

                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico no caracteres");
                                break;
                            }

                            int dui=0;
                            try{
                                dui=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese DUI: "));

                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico no caracteres");
                                break;
                            }

                            empleadoTemporal.add(new ServicioProfesional(nombre, posicion, salario, meses,dui));
                            sp=new ServicioProfesional(nombre, posicion, salario, meses, dui);
                            emp.addEmpleado(sp);


                            break;
                        case "2":
                            String nombre2 = JOptionPane.showInputDialog(null, "Nombre: ");
                            String posicion2 = JOptionPane.showInputDialog(null, "Posicion: ");
                            double salario2 = 0;
                            try{
                                salario2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));

                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico no caracteres");
                                break;
                            }

                            if(salario2<0){
                                JOptionPane.showMessageDialog(null,"El salario no puede ser menor a (0.0$)");
                                break;
                            }
                            int extension=0;
                            try{
                                extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Extension: "));

                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico no caracteres");
                                break;
                            }

                            int dui2=0;
                            try{
                                dui2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese DUI: "));

                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico no caracteres");
                                break;
                            }
                            empleadoFijo.add(new PlazaFija(nombre2, posicion2, salario2, extension,dui2));
                            pf=new PlazaFija(nombre2, posicion2, salario2, extension, dui2);
                            emp.addEmpleado(pf);

                            break;
                        default: JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                            break;
                    }

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Empleados de Servicio Profesional");
                    for (ServicioProfesional p : empleadoTemporal) {

                        JOptionPane.showMessageDialog(null, p.toString());
                    }
                    JOptionPane.showMessageDialog(null, "Empleados de Plaza Fija");
                    for (PlazaFija u : empleadoFijo) {
                        JOptionPane.showMessageDialog(null, u.toString());
                    }
                    break;

                case 3:
                    String tip = JOptionPane.showInputDialog(null,
                            "1- Servicio Profesional \n" +
                                    "2- Plaza Fija\n" +
                                    "Digite tipo a despedir: ");

                    switch (tip) {

                        case "1":
                            int opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea ver la lista de empleados?\n" +
                                    "1- Si\n" +
                                    "2- No\n"));

                            if (opc2==1){
                                JOptionPane.showMessageDialog(null,"Empleados de Servicio Profesional");
                                for (ServicioProfesional p : empleadoTemporal) {
                                    JOptionPane.showMessageDialog(null, p.toString());
                                }
                            }
                            String nombre2 = JOptionPane.showInputDialog(null, "Inserte nombre del empleado: ");
                            int DUI2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte DUI del empleado: "));
                            ServicioProfesional p2 = null;
                            for (ServicioProfesional s : empleadoTemporal) {

                                if (s.getDui() == DUI2) {
                                    p2 = s;
                                }
                            }
                            if (p2 != null) {
                                empleadoTemporal.remove(p2);
                            }
                            JOptionPane.showMessageDialog(null,"Se ha despedido a "+nombre2+" con numero de dui "+DUI2);
                            break;

                        case "2":
                            int opc3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea ver la lista de empleados?\n" +
                                    "1- Si\n" +
                                    "2- No\n"));

                            if (opc3==1){
                                JOptionPane.showMessageDialog(null,"Empleados de Plaza fija");
                                for (PlazaFija p : empleadoFijo) {
                                    JOptionPane.showMessageDialog(null, p.toString());
                                }
                            }
                            String nombre3 = JOptionPane.showInputDialog(null, "Inserte nombre del empleado: ");
                            int DUI = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte DUI del empleado: "));
                            PlazaFija p4 = null;
                            for (PlazaFija s : empleadoFijo) {

                                if (s.getDui2() == DUI) {
                                    p4 = s;
                                }
                            }
                            if (p4 != null) {
                                empleadoFijo.remove(p4);
                            }
                            JOptionPane.showMessageDialog(null,"Se ha despedido a "+nombre3+" con numero de dui "+DUI);
                            break;
                        default: JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                            break;
                    }
                    break;



                case 4:

                    String  d = JOptionPane.showInputDialog(null, "Nombre del empleado");
                    empleados = d;
                    for (Empleado aux : emp.getPlanilla()){
                        if (aux.getNombre().equals(d)) {

                            double pagando = CalculadoraImpuestos.pago(aux);
                            JOptionPane.showMessageDialog(null,"Pago con descuentos: $" + CalculadoraImpuestos.pago(aux));

                        }
                    }


                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,CalculadoraImpuestos.mostrarTotales());

                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,"Saliendo");
                    System.exit(0);
                            break;






            }
        } while (op != 8);

    }
}
