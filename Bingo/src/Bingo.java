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
    
    public static void ordenarFila(int fila[]) {
        int i, j, ant;
        for (i = 0; i < fila.length - 1; i++) {
            for (j = 0; j < fila.length - i - 1; j++) {
                if (fila[j + 1] < fila[j]) {
                    ant = fila[j + 1];
                    fila[j + 1] = fila[j];
                    fila[j] = ant;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numsBingo = 90;
        int[] bingo = new int[numsBingo];
        int[][] jugador1 = new int[5][5];
        int[][] jugador2 = new int[5][5];

        for (int i = 0; i < numsBingo; i++) {
            bingo[i] = i + 1;
        }

        System.out.println("Números del Bingo: ");
        for (int i = 0; i < numsBingo; i++) {
            System.out.print(bingo[i] + "  ");
        }
        System.out.println("");

        System.out.println("Cartón jugador 1: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numAzar = (int) (Math.random() * (numsBingo - 1 + 1));
                jugador1[i][j] = bingo[numAzar];
                for (int k = numAzar + 1; k < numsBingo; k++) {
                    bingo[k - 1] = bingo[k];
                }
                numsBingo--;
            }
        }

        for (int i = 0; i < jugador1.length; i++) {
                ordenarFila(jugador1[i]);
        }
        
        System.out.println("");
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
}
