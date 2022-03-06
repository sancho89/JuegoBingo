/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 6 mar. 2022 10:50:53
 */
public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Banco banco = new Banco();
        int opcion;
        int posicion;
        int posOrigen;
        int posDestino;
        boolean salir = false;
        double cantidad;
        String titular;
        double saldo;
        String busqueda;

        do {

            System.out.println("1 Ver cuentas.\n"
                    + "2 Ingresar dinero.\n"
                    + "3 Retirar dinero.\n"
                    + "4 Transferencia.\n"
                    + "5 Agregar cuenta.\n"
                    + "6 Eliminar cuenta.\n"
                    + "7 Buscar cuenta.\n"
                    + "8 Mostrar morosos.\n"
                    + "9 Salir.");

            System.out.println("¿Opción?");
            opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    try {
                    banco.imprimir();
                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 2:
                    try {

                    System.out.println("Introduce la cantidad a ingresar ");
                    cantidad = in.nextDouble();
                    System.out.println("Introduce la posición en la que deseas hacer el ingreso");
                    posicion = in.nextInt();
                    banco.ingresar(cantidad, posicion);

                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 3:
                    
                    try {

                    System.out.println("Introduce la cantidad a retirar ");
                    cantidad = in.nextDouble();
                    System.out.println("Introduce la posición en la que deseas hacer el reintegro");
                    posicion = in.nextInt();
                    banco.retirar(cantidad, posicion);

                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 4:
                    
                    try {

                    System.out.println("Introduce la cantidad a transferir ");
                    cantidad = in.nextDouble();
                    System.out.println("Introduce la posición de origen");
                    posOrigen = in.nextInt();
                    System.out.println("Introduce la posición de destino");
                    posDestino = in.nextInt();
                    banco.transferencia(cantidad, posOrigen, posDestino);

                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 5:
                    
                    try {

                    in.nextLine();
                    System.out.println("Introduce el nombre del titular");
                    titular = in.nextLine();
                    System.out.println("Introduce el saldo");
                    saldo = in.nextDouble();

                    banco.agregarCuenta(titular, saldo);

                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 6:
                    try {
                    System.out.println("Introduce la posición a eliminar");
                    posicion = in.nextInt();
                    banco.eliminarCuenta(posicion);
                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 7:
                    try {
                    System.out.println("Introduce la búsqueda");
                    busqueda = in.nextLine();
                    banco.buscarCuenta(busqueda);
                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 8:
                    try {
                    banco.mostrarMorosos();
                } catch (BancoException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 9:
                    System.out.println("Gracias, hasta la vista!");
                    salir = true;
                    break;
            }

        } while (!salir);

    }

}
