/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ejercicio1.Asignatura;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 11:22:20
 */
public class Main {
    
    public static void main(String[] args) {
        
        Asignatura a1 = new Asignatura ("Matemáticas", 1017, 1);
        Asignatura a2= new Asignatura ("Lenguaje", 354, 2);
        
        
        a1.imprimir();
        a2.imprimir();
    }

}
