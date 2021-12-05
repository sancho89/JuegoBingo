/*
 * Proyecto Bingo - Archivo Bingo.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 27 nov. 2021 10:22:11
 */
import java.util.Scanner;

import java.util.Arrays;

public class Bingo {

    // ORDENAMOS LAS FILAS DEL CARTÓN
    public static void ordenarFila(int jugador1[][]) {

        for (int i = 0; i < jugador1.length; i++) {
            Arrays.sort(jugador1[i]);
        }

    }

    // RELLENAMOS EL BINGO ALEATORIAMENTE
    public static void rellenarBingo(int numsBingo, int bingo[]) {

        numsBingo = 90;
        for (int i = 0; i < numsBingo; i++) {
            bingo[i] = i + 1;
        }
    }

    // SACAMOS LA BOLA DEL BINGO ALEATORIAMENTE
    public static int sacarBola(int numsBingo) {

        int numAzar = (int) (Math.random() * (numsBingo - 1 + 1));
        return numAzar;
    }

    // ELIMINAMOS LA BOLA EXTRAIDA DEL VECTOR BINGO PARA QUE NO SE REPITA
    public static int eliminarBola(int numsBingo, int bingo[], int numAzar) {

        for (int k = numAzar + 1; k < numsBingo; k++) {
            bingo[k - 1] = bingo[k];

        }
        numsBingo--;
        return numsBingo;
    }

    // GENERAMOS EL CARTÓN DEL JUGADOR RELLENANDO LA MATRIZ 5X5 ELIMINANDO EL NÚMERO QUE SACAMOS ALEATORIAMENTE
    public static void rellenarCarton(int carton[][], int numsBingo, int bingo[]) {

        int numAzar;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numAzar = sacarBola(numsBingo);
                carton[i][j] = bingo[numAzar];
                numsBingo = eliminarBola(numsBingo, bingo, numAzar);
            }
        }
    }

    // SI EL VALOR ES DE UNA CIFRA AÑADIMOS 2 ESPACIOS Y SI NO SÓLO 1 PARA QUE LA MATRIZ QUEDE ORDENADA Y SEA MÁS LEGIBLE
    public static void mostrarCarton(int jugador1[][]) {

        for (int i = 0; i < jugador1.length; i++) {
            for (int j = 0; j < jugador1.length; j++) {
                if (jugador1[i][j] < 10) {
                    System.out.print(jugador1[i][j] + "  ");
                } else {
                    System.out.print(jugador1[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    // RECORREMOS LA MATRIZ DEL JUGADOR BUSCANDO COINCIDENCIAS CON LA BOLA EXTRAIDA
    // SI ENCUENTRA COINCIDENCIA CAMBIO EL VALOR DE LA MATRIZ ACTUAL POR UN 0
    // VALORAMOS SI EL USUARIO O LA IA CANTAN LÍNEA
    static boolean compararNumero(int jugador1[][], int bingo[], int numsAzar, boolean hayLinea, int suma[], boolean esIA) {
        for (int i = 0; i < jugador1.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < jugador1.length; j++) {
                if (jugador1[i][j] == bingo[numsAzar]) {
                    jugador1[i][j] = 0;
                    if (!esIA) {
                        System.out.println("Lo tienes!");
                        mostrarCarton(jugador1);
                        System.out.println("");
                    }
                }
                sumaFila += jugador1[i][j];
            }
            suma[i] = sumaFila;
            if (sumaFila == 0 && hayLinea == false) {
                if (esIA) {
                    System.out.println("¡¡¡ LA IA HA CANTADO LÍNEA, VES A POR EL BINGO CORRE!!!");
                    hayLinea = true;
                    mostrarCarton(jugador1);
                } else {
                    hayLinea = true;
                    System.out.println("¡¡¡CANTA LÍNEA!!!");
                }
                hayLinea = true;
            }

        }
        return hayLinea;
    }

    // COMPROBAMOS SI HAY BINGO HACIENDO UN SUMATORIO DE LAS FILAS, SI ES 0 CANTAMOS BINGO
    public static boolean comprobarBingo(int suma[], boolean hayBingo, boolean esIA, int IA[][]) {
        int sumaBingo = 0;
        for (int i = 0; i < suma.length; i++) {
            sumaBingo += suma[i];
        }
        if (sumaBingo == 0) {
            if (esIA) {
                System.out.println("LA IA HA CANTADO BINGO... LO SIENTO, VUELVE A INTENTARLO!");
                hayBingo = true;
                mostrarCarton(IA);
            } else {
                hayBingo = true;
                System.out.println("¡¡¡CANTA BINGO!!!");
            }
            hayBingo = true;
        }
        return hayBingo;
    }

    // ENGLOBAMOS TODAS LAS FUNCIONES PREVIAS A QUE EMPIECE EL JUEGO PARA QUITAR CÓDIGO DEL MAIN
    public static void prepararBingo(int numsBingo, int bingo[], int jugador1[][], int IA[][]) {

        Scanner in = new Scanner(System.in);

        // RELLENAMOS CARTÓN DEL JUGADOR 1
        rellenarBingo(numsBingo, bingo);
        rellenarCarton(jugador1, numsBingo, bingo);
        ordenarFila(jugador1);

        // RELLENAMOS CARTÓN DE LA IA
        rellenarBingo(numsBingo, bingo);
        rellenarCarton(IA, numsBingo, bingo);
        ordenarFila(IA);

        // IMPRIMIMOS LOS CARTONES
        System.out.println("Cartón jugador 1: ");
        mostrarCarton(jugador1);
        System.out.println("");
        System.out.println("Cartón IA: ");
        mostrarCarton(IA);

        rellenarBingo(numsBingo, bingo);

        // COMIENZA EL BINGO
        System.out.println("");
        System.out.println("Están preparados jugadores??? JUGAMOS PARA BINGO!");
        in.nextLine();
    }

    // LAS FUNCIONES RESTANTES LAS METEMOS EN ESTA FUNCIÓN
    public static void jugarBingo(int numsBingo, int bingo[], int jugador1[][], int IA[][], boolean hayFila, boolean hayBingo, int sumaJugador[], int sumaIA[]) {

        Scanner in = new Scanner(System.in);

        while (hayBingo == false) {
            int numsAzar = sacarBola(numsBingo);
            System.out.println("");
            System.out.println("Bola número " + (bingo[numsAzar]) + "!");
            in.nextLine();
            hayFila = compararNumero(jugador1, bingo, numsAzar, hayFila, sumaJugador, false);
            hayFila = compararNumero(IA, bingo, numsAzar, hayFila, sumaIA, true);
            hayBingo = comprobarBingo(sumaJugador, hayBingo, false, jugador1);
            hayBingo = comprobarBingo(sumaIA, hayBingo, true, IA);
            numsBingo = eliminarBola(numsBingo, bingo, numsAzar);

        }

    }

    public static void main(String[] args) {

        // VARIABLES
        int[][] IA = new int[5][5];
        int numsBingo = 90;
        int[] bingo = new int[numsBingo];
        int[][] jugador1 = new int[5][5];
        int[] sumaJugador = new int[5];
        int[] sumaIA = new int[5];
        boolean hayFila = false;
        boolean hayBingo = false;

        prepararBingo(numsBingo, bingo, jugador1, IA);
        jugarBingo(numsBingo, bingo, jugador1, IA, hayFila, hayBingo, sumaJugador, sumaIA);

    }

}
