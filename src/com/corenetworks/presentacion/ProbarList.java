package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarList {
    public static void main(String[] args) {
        List lista = new ArrayList();
        System.out.println("Numero de elementos -> " + lista.size());
        System.out.println("Esta vacía la lista -> " + lista.isEmpty());
        lista.add("casa");
        lista.add("casa");
        System.out.println(lista);
        System.out.println("Contiene el String casa -> " + lista.contains("casa"));
        lista.add(7);
        System.out.println("Obtener el elemento 0 -> " + lista.get(0));
        lista.set(0, "Piso");
        System.out.println(lista);
        lista.set(0,"Adosado");
        System.out.println(lista);
        System.out.println("Posicion del elemento numerico 7 ->" + lista.indexOf(7));
        lista.remove("Adosado");
        System.out.println(lista);
        Empleado e1 = new Empleado(6);
        lista.add(e1);
        System.out.println(lista);
        System.out.println("Recorrer con un bucle");
        for (Object elemento:
             lista) {
            System.out.println(elemento.toString());
        }
        System.out.println("Recorrer con un bucle");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        //Declarar un array de 5 elementos y recorrerlo
        int[] arrNum = new int[5];
        arrNum[0] = 1;
        arrNum[1] = 3;
        arrNum[2] = 6;
        arrNum[3] = 9;
        arrNum[4] = 12;
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
        //Declarar un ArrayList de 5 elementos y recorrerlo

        List listaNum = new ArrayList();
        listaNum.add(10);
        listaNum.add(20);
        listaNum.add(30);
        listaNum.add(40);
        listaNum.add(50);
        for (int i =0; i<listaNum.size(); i++){
            System.out.println(listaNum.get(i));
        }
        for(Object elemento: listaNum){
            System.out.println(elemento);
        }


    }
}
