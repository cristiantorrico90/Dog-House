
package com.mycompany.peluqueriacanina.logica;

/**
 *
 * @author CRISTIAN DIEGO
 */
public class Duenio {
    private int id_duenio;
    private String nombre;
    private String celDuenio;
    
    //contructor vacio

    public Duenio() {
    }
    
    //constructor comparable

    public Duenio(int id_duenio, String nombre, String celDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }
    
    //metodos

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
}
