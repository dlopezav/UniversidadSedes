/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.util.ArrayList;

/**
 *
 * @author dfeli
 */
public class Profesional extends Sede{
    private int progAltaCalidad;
    private ArrayList<EducacionContinua> EC;

    @Override
    public String darInformacion() {
        return "Programas de alta calidad: " + this.progAltaCalidad;           
    }

    public Profesional(int progAltaCalidad, String nombre, String direccion, int telefono, double AreaConstruida) {
        super(nombre, direccion, telefono, AreaConstruida);
        this.progAltaCalidad = progAltaCalidad;
        this.EC = new ArrayList<>();
    }

    public int getProgAltaCalidad() {
        return progAltaCalidad;
    }

    public void setProgAltaCalidad(int progAltaCalidad) {
        this.progAltaCalidad = progAltaCalidad;
    }

    public ArrayList<EducacionContinua> getEC() {
        return EC;
    }

    public void setEC(ArrayList<EducacionContinua> EC) {
        this.EC = EC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getAreaConstruida() {
        return AreaConstruida;
    }

    public void setAreaConstruida(double AreaConstruida) {
        this.AreaConstruida = AreaConstruida;
    }
    
    
    
}
