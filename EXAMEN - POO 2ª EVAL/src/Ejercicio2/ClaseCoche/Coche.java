/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Coche.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Ejercicio2.ClaseCoche;

enum tipoCoche {
    MINI, UTILITARIO, FAMILIAR, DEPORTIVO
};

enum modalidadSeguro {
    TERCEROS, TODO_RIESGO
};

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 11:26:29
 */
public class Coche {

    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private tipoCoche tipo;
    private int anyoFabricacion;
    private modalidadSeguro modalidad;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public void setMetalizada(boolean esMetalizada) {
        this.metalizada = esMetalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public tipoCoche getTipo() {
        return tipo;
    }

    public void setTipo(tipoCoche tipo) {
        this.tipo = tipo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public modalidadSeguro getModalidad() {
        return modalidad;
    }

    public void setModalidad(modalidadSeguro modalidad) {
        this.modalidad = modalidad;
    }

    public Coche(String modelo, String color, boolean esMetalizada, String matricula, tipoCoche tipo, int anyoFabricacion, modalidadSeguro modalidad) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = esMetalizada;
        this.matricula = matricula;
        this.tipo = tipo;
        this.anyoFabricacion = anyoFabricacion;
        this.modalidad = modalidad;
    }

    public void imprimir() {
        System.out.println("Modelo: " + modelo + "\n"
                + "Color: " + color + "\n"
                + "Pintura: " + metalizada + "\n"
                + "Matrícula: " + matricula + "\n"
                + "Tipo coche: " + tipo + "\n"
                + "Año Fabricación: " + anyoFabricacion + "\n"
                + "Modalidad Seguro: " + modalidad);
    }
}
