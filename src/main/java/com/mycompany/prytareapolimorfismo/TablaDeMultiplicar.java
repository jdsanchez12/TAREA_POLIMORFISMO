/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prytareapolimorfismo;

import java.util.List;

/**
 *
 * @author HP
 */
abstract class TablaDeMultiplicar {
    //ATRIBUTOS
    protected int numero;
    //CONSTRUCTOR

    public TablaDeMultiplicar(int numero) {
        this.numero = numero;
    }
    //GENERA LA LISTA
    public abstract List<Integer> generarTabla();

    
}
