/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Punto.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EjercicioA1;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 10:48:22
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void imprimir() {
        System.out.println("Coordenadas: (" + getX() + ", " + getY() + ")");
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx, int dy) {
        setXY(x + dx, y + dy);
    }
    
    public int distancia(Punto p) {
        
        return (int) Math.sqrt((p.x - this.x)* (p.x - this.x) + (p.y - this.y)* (p.y - this.y));
        
    }

}
