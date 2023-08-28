/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajoarraydinamico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ingmi
 */
public class TrabajoArrayDinamico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();

        int j = 0;
        String seguir = "S";

        do {
            System.out.println("Ingrese nombre " + (j + 1) + ": ");
            String name = sc.nextLine();
            names.add(j, name);
            j++;
            System.out.println("Desea salir presione N");
            seguir = sc.nextLine();
        } while (!"N".equals(seguir));

        for (int i = 0; i < names.size(); i++) {

            System.out.println("Nombre " + (i+1) + ": " + names.get(i));

        }
    }

}
