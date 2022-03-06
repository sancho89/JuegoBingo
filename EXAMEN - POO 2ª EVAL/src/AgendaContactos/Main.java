/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package AgendaContactos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 18:05:16
 */
public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        boolean salir = false;
        int opcion;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("1. Ver contactos.\n"
                    + "2. Agregar contacto.\n"
                    + "3. Eliminar contacto.\n"
                    + "4. Buscar por nombre.\n"
                    + "5. Buscar por teléfono.\n"
                    + "6. Buscar por correo.\n"
                    + "7. Búsqueda global.\n"
                    + "8. Salir.");

            System.out.println("¿Opción?");
            opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    try {
                    agenda.verContactos();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 2:

                    try {
                    in.nextLine();
                    System.out.println("Introduce el nombre");
                    String nombre = in.nextLine();

                    System.out.println("Introduce el teléfono");
                    String telefono = in.nextLine();

                    System.out.println("Introduce el correo");
                    String correo = in.nextLine();

                    Contacto c = new Contacto(nombre, telefono, correo);
                    agenda.agregarContacto(c);

                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    in.nextLine();

                }
                break;

                case 3:
                    
                    try {
                    int posicion;
                    System.out.println("Introduce la posición a borrar.");
                    posicion = in.nextInt();

                    agenda.eliminarContacto(posicion);

                } catch (InputMismatchException e) {
                    System.err.println("ERROR: Valor introducido no válido");
                    in.nextLine();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }

                break;

                case 4:

                    
                    try {
                    in.nextLine();
                    System.out.println("Introduce el nombre que quieres buscar.");
                    String busquedaNom = in.nextLine();
                    agenda.buscarNombre(busquedaNom);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 5:

                    
                    try {
                    System.out.println("Introduce el teléfono que quieres buscar.");
                    String busquedaTelf = in.nextLine();
                    agenda.buscarTelefono(busquedaTelf);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 6:

                    
                    try {
                    System.out.println("Introduce el correo que quieres buscar.");
                    String busquedaCorreo = in.nextLine();
                    agenda.buscarCorreo(busquedaCorreo);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 7:

                    
                    try {
                    System.out.println("Introduce la búsqueda");
                    String busquedaGlobal = in.nextLine();
                    agenda.buscarGlobal(busquedaGlobal);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;

                default:
                    System.out.println("Hasta la vista!");
                    salir = true;
                    break;
            }

        } while (!salir);

    }

}
