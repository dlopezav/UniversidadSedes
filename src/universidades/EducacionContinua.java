/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dfeli
 */
public class EducacionContinua extends Sede implements Serializable{
    private String CursoPopular; 
    private ArrayList<ProgramasEcontinua> programas;
    

    public EducacionContinua(String nombre, String direccion, int telefono, double AreaConstruida) {
        super(nombre, direccion, telefono, AreaConstruida);
        this.CursoPopular = CursoPopular;
        this.programas = new ArrayList<>();
        
    }
    @Override
    protected String darInformacion() {
        String x="\n"+nombre+" "+telefono+" "+direccion+"\nCurso popular: "+CursoPopular+"\n";
        for(ProgramasEcontinua a: programas){
            x+=a.getNombre()+": "+a.getDescripcion()+", ";
        }
        return x;
    }
    
    public String getCursoPopular() {
        return CursoPopular;
    }

    public void setCursoPopular(String CursoPopular) {
        this.CursoPopular = CursoPopular;
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

    public ArrayList<ProgramasEcontinua> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<ProgramasEcontinua> programas) {
        this.programas = programas;
    }

    

   

    

    
}
