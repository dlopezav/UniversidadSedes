/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dfeli
 */
public class Tecnologico extends Sede implements Serializable{
    private int estudiantes;
    private ArrayList<ProgramaDeFormacion> proFormacion;
    
    
    @Override
    public String darInformacion() {
        String x= "\n"+nombre+" "+telefono+" "+direccion+"\nEstudiantes: "+estudiantes+"\n"+"Programas: ";
        
        for(ProgramaDeFormacion a: proFormacion){
            x+=a.getNombre()+": "+a.getDescripcion()+", ";
        }
        return x;
    }

    public Tecnologico(String nombre, String direccion, int telefono, double AreaConstruida, int estudiantes) {
        super(nombre, direccion, telefono, AreaConstruida);
        this.estudiantes = estudiantes;
        this.proFormacion = new ArrayList<>();
    }

    public int getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(int estudiantes) {
        this.estudiantes = estudiantes;
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

    public ArrayList<ProgramaDeFormacion> getProFormacion() {
        return proFormacion;
    }

    public void setProFormacion(ArrayList<ProgramaDeFormacion> proFormacion) {
        this.proFormacion = proFormacion;
    }

    
   

    
    
    
}
