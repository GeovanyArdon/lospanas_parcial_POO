package com.GJAV.x00118618;


import java.util.ArrayList;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<ServicioProfesional> empresa = new ArrayList<>();
        ArrayList<PlazaFija> empresa2 = new ArrayList<>();

        byte op = 0;

        String menu =
                        "1. Agregar empleado\n" +
                        "2. Mostrar empleado\n" +
                        "3. Buscar item por ID\n" +
                        "4. Buscar item por tipo\n" +
                        "5. Borrar item por ID\n" +
                        "6. Borrar item por tipo\n" +
                        "7. Compartir lista\n" +
                        "8. Salir";

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
                        double salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Salario: "));
                        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contrato: "));
                        empresa.add(new ServicioProfesional(nombre, posicion, salario, meses));
                        break;
                        case "2":
                        String nombre2 = JOptionPane.showInputDialog(null, "Nombre: ");
                        String posicion2 = JOptionPane.showInputDialog(null, "Posicion: ");
                        double salario2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Salario: "));
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Extension: "));
                        empresa2.add(new PlazaFija(nombre2, posicion2, salario2, extension));
                        break;
                        default: JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                    }

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Empleados de Servicio Profesional");
                    for (ServicioProfesional p : empresa) {
                    JOptionPane.showMessageDialog(null, p.toString());
                    }
                    JOptionPane.showMessageDialog(null, "Empleados de Plaza Fija");
                    for (PlazaFija u : empresa2) {
                        JOptionPane.showMessageDialog(null, u.toString());
                    }
                    break;
                    /*
                case 3:
                    int idBuscar = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite ID a buscar: "));

                    PersonalItems.forEach(obj -> {
                        if(obj.getID() == idBuscar){
                            if(obj instanceof Healthitem)
                                JOptionPane.showMessageDialog(null, obj.toString());
                            else
                                JOptionPane.showMessageDialog(null, obj.toString());
                        }
                    });
                    break;

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
