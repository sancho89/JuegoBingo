/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Banco.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Banco;

import java.util.ArrayList;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 6 mar. 2022 10:46:30
 */
public class Banco {

    private ArrayList<Cuenta> cuentas;
    private static final int MAX = 100;

    public Banco() {
        cuentas = new ArrayList();
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void imprimir() throws BancoException {
        if (cuentas.size() > 0) {
            for (int i = 0; i < cuentas.size(); i++) {
                System.out.println(i + ". " + cuentas.get(i).getAll());
            }
        } else {
            throw new BancoException("ERROR: Lista vacía");
        }
    }

    public void ingresar(double cantidad, int posicion) throws BancoException {

        if (posicion >= 0 && posicion <= cuentas.size()) {
            if (cantidad >= 0) {
                cuentas.get(posicion).setSaldo(cantidad + cuentas.get(posicion).getSaldo());
                System.out.println("Ingreso realizado con éxito");
            } else {
                throw new BancoException("ERROR: Cantidad a ingresar no válida");
            }
        } else {
            throw new BancoException("ERROR: La cuenta introducida no existe");
        }
    }

    public void retirar(double cantidad, int posicion) throws BancoException {

        if (posicion >= 0 && posicion <= cuentas.size()) {
            if (cantidad >= 0) {
                if ((cuentas.get(posicion).getSaldo() - cantidad) >= -100) {
                    cuentas.get(posicion).setSaldo(cantidad - cuentas.get(posicion).getSaldo());
                    System.out.println("Dinero retirado con éxito");
                } else {
                    throw new BancoException("ERROR: No puedes tener un saldo negativo de más de 100 €");
                }
            } else {
                throw new BancoException("ERROR: Cantidad a ingresar no válida");
            }
        } else {
            throw new BancoException("ERROR: La cuenta introducida no existe");
        }

    }

    public void transferencia(double cantidad, int posOrigen, int posDestino) throws BancoException {

        if (posOrigen >= 0 && posOrigen <= cuentas.size() && posDestino >= 0 && posDestino <= cuentas.size()) {
            if (cantidad >= 0) {
                if ((cuentas.get(posOrigen).getSaldo() - cantidad) >= -100) {
                    cuentas.get(posOrigen).setSaldo(cantidad - cuentas.get(posOrigen).getSaldo());
                    cuentas.get(posDestino).setSaldo(cantidad + cuentas.get(posDestino).getSaldo());
                    System.out.println("Transferencia realizada con éxito");
                } else {
                    throw new BancoException("ERROR: No puedes tener un saldo negativo de más de 100 €");
                }
            } else {
                throw new BancoException("ERROR: Cantidad a ingresar no válida");
            }
        } else {
            throw new BancoException("ERROR: La cuenta introducida no existe");
        }
    }

    public void agregarCuenta(String titular, double saldo) throws BancoException {

        boolean contiene = false;

        if (cuentas.size() < MAX) {
            for (int i = 0; i < cuentas.size(); i++) {
                if (cuentas.get(i).getTitular().toUpperCase().contains(titular.toUpperCase())) {
                    contiene = true;
                }
            }
            if (!contiene) {
                cuentas.add(new Cuenta(titular, saldo));
                System.out.println("Cuenta creada correctamente");
            } else {
                throw new BancoException("ERROR: Ya existe un titular con el mismo nombre");
            }
        } else {
            throw new BancoException("ERROR: Lista llena");
        }
    }

    public void eliminarCuenta(int posicion) throws BancoException {
        imprimir();

        if (posicion >= 0 && posicion <= cuentas.size()) {
            cuentas.remove(posicion);
            System.out.println("Cuenta eliminada con éxito");
        } else {
            throw new BancoException("ERROR: La cuenta introducida no existe");
        }
    }

    public void buscarCuenta(String busqueda) throws BancoException {

        int cont = 0;

        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getTitular().toUpperCase().contains(busqueda.toUpperCase())) {
                cuentas.get(i).imprimir();
                cont++;
            }
        }
        if (cont == 0) {
            throw new BancoException("ERROR: No se han encontrado coincidencias");
        }
    }

    public void mostrarMorosos() throws BancoException {

        int cont = 0;
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getSaldo() < 0) {
                cuentas.get(i).imprimir();
                cont++;
            }
        }
        if (cont == 0) {
            throw new BancoException("ERROR: No hay morosos que mostrar");
        }
    }
}
