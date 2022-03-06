/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Asignatura.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ejercicio1.Asignatura;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 11:16:59
 */
public class Asignatura {
    
    private String nombre;
    private int codigo;
    private int curso;

    public Asignatura(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    public void imprimir() {
        
        System.out.println("Asignatura: " + getNombre() + "  Código: " + getCodigo() + "  Curso: " + getCurso());
        
    }

}
