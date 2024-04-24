/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoPorSeleccion {

    public static void ordenarPorSeleccion(ArrayList<Double> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            // Encuentra el índice del mínimo elemento
            int indiceMinimo = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(indiceMinimo)) {
                    indiceMinimo = j;
                }
            }
            // Intercambia el elemento mínimo con el elemento en la posición i
            Collections.swap(lista, i, indiceMinimo);
        }
    }

    public static void main(String[] args) {
        // Ejemplo de tiempos desordenados de corredores
        ArrayList<Double> tiempos = new ArrayList<>();
        tiempos.add(12.5);
        tiempos.add(10.2);
        tiempos.add(11.8);
        tiempos.add(10.9);
        tiempos.add(11.3);

        // Mostrar tiempos antes del ordenamiento
        System.out.println("Tiempos de llegada desordenados: " + tiempos);

        // Ordenar los tiempos
        ordenarPorSeleccion(tiempos);

        // Mostrar tiempos después del ordenamiento
        System.out.println("Tiempos de llegada ordenados: " + tiempos);
    }
}