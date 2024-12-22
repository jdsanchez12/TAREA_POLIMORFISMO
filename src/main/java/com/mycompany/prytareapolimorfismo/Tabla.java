/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prytareapolimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
class Tabla extends TablaDeMultiplicar{
 //ATRIBUTOS
    private boolean ascendente;
    private boolean invertir;
   //CONSTRUCTOR

    public Tabla(boolean ascendente, boolean invertir, int numero) {
        super(numero);
        this.ascendente = ascendente;
        this.invertir = invertir;
    }
//LO QUE GENERA AL EXTENDER LA CLASE
    @Override
    public List<Integer> generarTabla() {
   List<Integer> tabla = new ArrayList<>();
        int inicio = invertir ? 10 : 1;
        int fin = invertir ? 1 : 10;
        int paso = invertir ? -1 : 1;     
        //INICIA OCN UN CICLO FOR
        for (int i = inicio; (invertir ? i >= fin : i <= fin); i += paso) {
            tabla.add(numero * i);
        }

        if (!ascendente) {
            List<Integer> tablaInvertida = new ArrayList<>(tabla);
            for (int i = tabla.size() - 1; i >= 0; i--) {
                tablaInvertida.add(tabla.get(i));
            }
            return tablaInvertida;
        }

        return tabla;
    }
    
}
