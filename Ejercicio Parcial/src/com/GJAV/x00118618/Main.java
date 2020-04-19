package com.GJAV.x00118618;




import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        ArrayList<ServicioProfesional> empleadoTemporal = new ArrayList<>();
        ArrayList<PlazaFija> empleadoFijo = new ArrayList<>();

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


                        if(salario<250){
                            JOptionPane.showMessageDialog(null,"El salario no puede ser menor al minimo(250.00 $)");
                            break;
                        }
                        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contrato: "));
                        int dui=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese DUI: "));
                        String empleado=nombre;
                        //Se crea una lista solo de los empleados Temporales
                        empleadoTemporal.add(new ServicioProfesional(nombre, posicion, salario, meses,dui));

                        break;
                        case "2":
                        String nombre2 = JOptionPane.showInputDialog(null, "Nombre: ");
                        String posicion2 = JOptionPane.showInputDialog(null, "Posicion: ");
                        double salario2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Salario: "));
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Extension: "));
                        int dui2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese DUI: "));
                        empleadoFijo.add(new PlazaFija(nombre2, posicion2, salario2, extension,dui2));


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

                            if (opc3==2){
                                JOptionPane.showMessageDialog(null,"Empleados de Plaza fija");
                                for (PlazaFija p : empleadoFijo) {
                                    JOptionPane.showMessageDialog(null, p.toString());
                                }
                            }
                            String nombre3 = JOptionPane.showInputDialog(null, "Inserte nombre del empleado: ");
                            int DUI = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte DUI del empleado: "));
                            ServicioProfesional p4 = null;
                            for (ServicioProfesional s : empleadoTemporal) {

                                if (s.getDui() == DUI) {
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


                    /*
                case 4:
                    int opc3 = Integer.parseInt((JOptionPane.showInputDialog(null, "1.Healthitem" + "\n2.Reusableitem")));
                    String mesHealthitem = "", mesReusableitem = "";
                    for(Item p :  PersonalItems){
                        if(p instanceof Healthitem)
                            mesHealthitem += p.toString() + "\n";
                        else if(p instanceof Reusableitem)
                            mesReusableitem += p.toString() + "\n";
                    }
                    switch (opc3) {
                        case 1:
                            JOptionPane.showMessageDialog(null, mesHealthitem);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, mesReusableitem);
                            break;
                    }

                    break;
                case 5:
                    int ID6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte Id a eliminar: "));
                    Item p2 = null;
                    for (Item s : PersonalItems) {
                        if (s.getID() == ID6) {
                            p2 = s;
                        }
                    }
                    if (p2 != null) {
                        PersonalItems.remove(p2);
                    }


                    break;


                case 6:
                    int n = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Healthitem" + "\n2.Reusableitem"));
                    if (n == 1) {
                        PersonalItems.removeIf(obj -> obj instanceof Healthitem);
                        JOptionPane.showMessageDialog(null, "Has eliminado Healthitem");
                    } else if (n == 2) {
                        PersonalItems.removeIf(obj -> obj instanceof Reusableitem);
                        JOptionPane.showMessageDialog(null, "Has eliminado Reusableitem");
                    }

                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo . . .");
                    break;

                case 7:
                    Commomitems = (ArrayList)PersonalItems.clone();
                    JOptionPane.showMessageDialog(null, "Lista Commonitems");
                    JOptionPane.showMessageDialog(null, Commomitems);
                    JOptionPane.showMessageDialog(null, "La lista ha sido compartida");

                    break;
                    */

            }
        } while (op != 8);

    }
}
