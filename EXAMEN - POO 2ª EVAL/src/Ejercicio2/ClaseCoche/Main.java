/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ejercicio2.ClaseCoche;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 11:43:01
 */
public class Main {
    
    public static void main(String[] args) {
 
        Coche c1 = new Coche ("Seat", "Granate", true, "3055 KXG", tipoCoche.UTILITARIO, 2018, modalidadSeguro.TODO_RIESGO);
        
        c1.imprimir();
    }   

}
