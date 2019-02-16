/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

/**
 *
 * @author dfeli
 */
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected double AreaConstruida;
    
    public abstract String darInformacion();    

    public Sede(String nombre, String direccion, int telefono, double AreaConstruida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.AreaConstruida = AreaConstruida;
    }
    
    
}
