/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.io.Serializable;

/**
 *
 * @author dfeli
 */
public class Persona implements Serializable {
    protected String nombre;
    protected Boolean titulo;
    protected String colegio;
    protected String AñoGrado;

    public Persona(String nombre, Boolean titulo, String colegio, String AñoGrado) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.colegio = colegio;
        this.AñoGrado = AñoGrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTitulo() {
        return titulo;
    }

    public void setTitulo(Boolean titulo) {
        this.titulo = titulo;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getAñoGrado() {
        return AñoGrado;
    }

    public void setAñoGrado(String AñoGrado) {
        this.AñoGrado = AñoGrado;
    }
    
    
    
}
