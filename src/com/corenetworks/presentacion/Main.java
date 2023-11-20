package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Probar la interface Set
        HashSet conjunto = new HashSet(); //Sin usar polimorfismo
        Set conjunto1 = new HashSet(); //Recomendable utilizar polimorfismo
        System.out.println("esta vacio ? ->" + conjunto1.isEmpty());

        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1);
        conjunto1.add("jardin");
        System.out.println(conjunto1);

        System.out.println("La coleccion contiene el elemento casa ? " + conjunto1.contains("casa"));
        System.out.println("numero de elementos " +conjunto1.size());
        conjunto1.add("silla");
        conjunto1.add("mesa");
        conjunto1.add(5);
        System.out.println(conjunto1);

        Empleado e1 = new Empleado(1);
        conjunto1.add(e1);
        System.out.println(conjunto1);
        System.out.println(conjunto1.remove(e1));
        System.out.println(conjunto1);
        System.out.println("Recorrer el conjunto ..");
        for (Object elemento:
             conjunto1) {
            System.out.println(elemento.toString());
        }


    }
}