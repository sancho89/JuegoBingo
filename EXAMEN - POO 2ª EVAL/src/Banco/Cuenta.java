/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Cuenta.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Banco;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 6 mar. 2022 10:50:48
 */
public class Cuenta {
    
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getAll () {
        return getTitular() + "  " + "Saldo: " + getSaldo() + " €";
    }
    
    public void imprimir () {
        System.out.println(getAll());
    }

}
