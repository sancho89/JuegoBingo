/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Banco.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Ejercicio3.ClaseBanco;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 11:48:08
 */
public class Cuenta {

    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {

        this.numeroCuenta = numeroCuenta;

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.err.println("ERROR. No se permiten cuentas con saldo negativo.");
        }

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) throws Exception {

        if (cantidad >= 0) {
            setSaldo(saldo + cantidad);
        } else {
            throw new Exception("ERROR. No se permite ingresar cantidades negativas.");
        }

    }

    public boolean retirar(double cantidad) throws Exception {

        if (cantidad >= 0) {
            if (saldo - cantidad > 0) {
                setSaldo(saldo - cantidad);
            } else {
                throw new Exception("ERROR. No se permite cuentas con saldo negativo.");
            }
        } else {
            throw new Exception("ERROR. No se permite retirar cantidades negativas.");
        }

        return true;
    }

}
