/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prytareapolimorfismo;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PryTareaPolimorfismo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("------JOHN SANCHEZ-----------1939------");
          System.out.println("----------Generador de Tablas de Multiplicar--------------");

        try {
            //ESCOGE UN NUMERO MAYOR A 2 PARA GENERAR LA TABLA
            System.out.print("Ingrese hasta que numero desea generar las tablas de multiplicar (minimo 2): ");
            int ultimoNumero = scanner.nextInt();
            if (ultimoNumero < 2) {
                throw new IllegalArgumentException("El numero debe ser al menos 2.");
            }

            System.out.print("¿Desea mostrar las tablas en orden ascendente (A) o descendente (D)? [A/D]: ");
            boolean ascendente = scanner.next().equalsIgnoreCase("A");

            System.out.print("¿Desea invertir las tablas (de 10 a 1)? [S/N]: ");
            boolean invertir = scanner.next().equalsIgnoreCase("S");

            int sumaTotal = 0;

            for (int i = 2; i <= ultimoNumero; i++) {
                //SE UTILIZA EL POLIMORFISMO
                Tabla tabla=new Tabla(ascendente, invertir, i);
                List<Integer> resultados = tabla.generarTabla();

                System.out.println("Tabla del " + i + ": " + resultados);
                int sumaTabla = resultados.stream().mapToInt(Integer::intValue).sum();
                System.out.println("Suma de la tabla: " + sumaTabla);
                sumaTotal += sumaTabla;
            }

            System.out.println("Suma total de los resultados de todas las tablas: " + sumaTotal);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    
    }
}
