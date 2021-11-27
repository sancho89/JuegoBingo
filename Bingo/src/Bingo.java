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

public class Bingo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numsBingo = 90;
        int[] bingo = new int[numsBingo];
        int[][] jugador1 = new int[5][5];
        int[][] jugador2 = new int[5][5];
        int[][] jugador3 = new int[5][5];
        int[][] jugador4 = new int[5][5];
        int[][] jugador5 = new int[5][5];
        int[][] jugador6 = new int[5][5];

        for (int i = 0; i < numsBingo; i++) {
            bingo[i] = i + 1;
        }

        System.out.println("Números del Bingo: ");
        for (int i = 0; i < numsBingo; i++) {
            System.out.print(bingo[i] + "  ");
        }

        System.out.println("Cartón jugador 1: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                do {
                    
                } while (true);
                
                    jugador1[i][j] = (int) (Math.random() * (90 - 1 + 1) + 1);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(jugador1[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
