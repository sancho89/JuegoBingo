/*
 * Proyecto EXAMEN_-_POO_2__EVAL - Archivo Agenda.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package AgendaContactos;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 5 mar. 2022 16:53:30
 */
public class Agenda {

    private Contacto[] contactos;
    private int nContactos;
    private static final int MAX = 100;

    public Agenda() {
        contactos = new Contacto[MAX];
        nContactos = 0;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }

    public int getnContactos() {
        return nContactos;
    }

    public void setnContactos(int nContactos) {
        this.nContactos = nContactos;
    }

    public void verContactos() throws Exception {

        if (nContactos > 0) {
            for (int i = 0; i < nContactos; i++) {
                System.out.println(i + ". " + contactos[i].getAll());
            }
        } else {
            throw new Exception("ERROR: No hay contactos.");
        }

    }

    public void agregarContacto(Contacto c) throws Exception {

        boolean coincide = false;

        if (nContactos < MAX) {

            for (int i = 0; i < nContactos; i++) {
                if (contactos[i].getNombre().toUpperCase().contains(c.getNombre().toUpperCase())) {
                    coincide = true;
                    throw new Exception("ERROR: No se permite tener dos contactos con el mismo nombre.");
                }
            }

            if (!coincide) {
                contactos[nContactos] = c;
                nContactos++;
            }
        } else {

            throw new Exception("ERROR: Lista llena");
        }
    }

    public void eliminarContacto(int posicion) throws Exception {

        if (posicion >= 0 && posicion < nContactos) {

            for (int i = posicion + 1; i < nContactos; i++) {

                contactos[i - 1] = contactos[i];
            }

            nContactos--;

        } else {
            throw new Exception("ERROR: Posición no válida");
        }

    }

    public void buscarNombre(String busqueda) throws Exception {

        boolean coincide = false;

        for (int i = 0; i < nContactos; i++) {
            if (contactos[i].getNombre().toUpperCase().indexOf(busqueda.toUpperCase()) >= 0) {
                contactos[i].imprimir();
                coincide = true;
            }
        }

        if (!coincide) {
            throw new Exception("ERROR: No se han encontrado contactos.");
        }
    }

    public void buscarTelefono(String busqueda) throws Exception {

        boolean coincide = false;

        for (int i = 0; i < nContactos; i++) {
            if (contactos[i].getTelefono().toUpperCase().indexOf(busqueda.toUpperCase()) >= 0) {
                contactos[i].imprimir();
                coincide = true;
            }
        }

        if (!coincide) {
            throw new Exception("ERROR: No se han encontrado contactos.");
        }
    }

    public void buscarCorreo(String busqueda) throws Exception {

        boolean coincide = false;

        for (int i = 0; i < nContactos; i++) {
            if (contactos[i].getCorreo().toUpperCase().indexOf(busqueda.toUpperCase()) >= 0) {
                contactos[i].imprimir();
                coincide = true;
            }
        }

        if (!coincide) {
            throw new Exception("ERROR: No se han encontrado contactos.");
        }
    }

    public void buscarGlobal(String busqueda) throws Exception {

        boolean coincide = false;

        for (int i = 0; i < nContactos; i++) {
            if (contactos[i].getTelefono().toUpperCase().indexOf(busqueda.toUpperCase()) >= 0 || contactos[i].getTelefono().toUpperCase().indexOf(busqueda.toUpperCase()) >= 0 || contactos[i].getCorreo().toUpperCase().indexOf(busqueda.toUpperCase()) >= 0) {
                contactos[i].imprimir();
                coincide = true;
            }
        }

        if (!coincide) {
            throw new Exception("ERROR: No se han encontrado contactos.");
        }

    }

}
