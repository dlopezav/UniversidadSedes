/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;


import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Felipe López Avila
 */
public class Universidad implements Serializable{

    
    private String nombre;
    public ArrayList<Sede> sedes;
    
    
    public Universidad(String nombre) {
        this.nombre=nombre;
        this.sedes = new ArrayList<>();
        
    }
    
   
    public void añadirTecnologico(String nombre, String direccion, int telefono, double AreaConstruida, int estudiantes) {
       Sede a= new Tecnologico(nombre,direccion,telefono,AreaConstruida,estudiantes);
       sedes.add(a);
   }
   public void añadirProfesional(int progAltaCalidad, String nombre, String direccion, int telefono, double AreaConstruida) {
       Sede b= new Profesional(progAltaCalidad, nombre, direccion, telefono, AreaConstruida);
       sedes.add(b);
   }
    public void añadirEdContinua(String nombre, String direccion, int telefono, double AreaConstruida) {
       Sede c= new EducacionContinua(nombre, direccion, telefono, AreaConstruida);
       sedes.add(c);
   }
    public void eliminarSede(String nombre) throws IOException{
        for(Sede e: sedes){
            if(e.nombre.equals(nombre)){
                sedes.remove(e);
            }
        }
    }
    
    public String ListarSedes() {
        String x="";
       for(Sede r: sedes){
           if(r instanceof Tecnologico){
               x+="\n\nTecnologico: "+((Tecnologico)r).darInformacion();
           }
           if(r instanceof Profesional){
               x+="\n\nProfesional: "+((Profesional)r).darInformacion();
           }
           if(r instanceof EducacionContinua){
               x+="\n\nEducacion continua: "+((EducacionContinua)r).darInformacion();
           }
       }
       return x;
    }
    
    }
    

