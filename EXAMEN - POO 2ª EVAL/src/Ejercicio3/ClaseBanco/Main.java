/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Ejercicio3.ClaseBanco;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 11:57:23
 */
public class Main {

    public static void main(String[] args) {

        try {

            Cuenta c1 = new Cuenta(12345, 2000);
            c1.ingresar(-100);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            
        }

    }

}
