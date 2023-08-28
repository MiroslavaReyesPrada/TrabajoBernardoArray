/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajoarraydinamico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ingmi
 */
public class TrabajoArrayDinamico1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        int j = 0;
        String seguir = "S";
        String msjFinal = "";
        do {
            String name = JOptionPane.showInputDialog("Ingrese el nombre");
            names.add(j, name);
            msjFinal = msjFinal + ("Nombre " + (j + 1) + ": " + names.get(j) + "\n");
            j++;
            seguir = JOptionPane.showInputDialog("Desea salir presione N");
        } while (!"N".equals(seguir));

        JOptionPane.showMessageDialog(null, msjFinal, "Lista de Nombres", JOptionPane.INFORMATION_MESSAGE);
    }

}
