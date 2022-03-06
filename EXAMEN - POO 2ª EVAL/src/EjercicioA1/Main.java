/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package EjercicioA1;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 10:51:05
 */
public class Main {
    
    public static void main(String[] args) {
        
        Punto p1 = new Punto (5,0);
        Punto p2 = new Punto (10,10);
        Punto p3 = new Punto (-3,7);
        
        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
 
        System.out.println(p1.distancia(p3));
        
    }

}
