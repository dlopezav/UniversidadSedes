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
public class Profesional extends Sede implements Serializable{
    private int progAltaCalidad;
    private ArrayList<ProgramaDeFormacion> proFormacion;
    private ArrayList<ProgramaDeFormacion> proTecnicos;
    private ArrayList<ProgramasEcontinua> proContinua;
    
    
    @Override
    public String darInformacion() {
       String x= "\n"+nombre+" "+telefono+" "+direccion+"\n"+progAltaCalidad+"\n"+"Programas profesionales: ";
        for(ProgramaDeFormacion a: proFormacion){
            x+=a.getNombre()+": "+a.getDescripcion()+" ";
        }
        x+="\nProgramas tecnicos: ";
        for(ProgramaDeFormacion a: proTecnicos){
            x+=a.getNombre()+": "+a.getDescripcion()+" ";
        }
        x+="\nProgramas de educacion continua";
        for(ProgramasEcontinua a: proContinua){
            x+=a.getNombre()+": "+a.getDescripcion()+" ";
        }
        return x;
    }

    public Profesional(int progAltaCalidad, String nombre, String direccion, int telefono, double AreaConstruida) {
        super(nombre, direccion, telefono, AreaConstruida);
        this.progAltaCalidad = progAltaCalidad;
        this.proFormacion = new ArrayList<>();
        this.proContinua = new ArrayList<>();
        this.proTecnicos = new ArrayList<>();
    }

    public int getProgAltaCalidad() {
        return progAltaCalidad;
    }

    public void setProgAltaCalidad(int progAltaCalidad) {
        this.progAltaCalidad = progAltaCalidad;
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

    public ArrayList<ProgramaDeFormacion> getProTecnicos() {
        return proTecnicos;
    }

    public void setProTecnicos(ArrayList<ProgramaDeFormacion> proTecnicos) {
        this.proTecnicos = proTecnicos;
    }

    public ArrayList<ProgramasEcontinua> getProContinua() {
        return proContinua;
    }

    public void setProContinua(ArrayList<ProgramasEcontinua> proContinua) {
        this.proContinua = proContinua;
    }

    

    
    
    
    
}
