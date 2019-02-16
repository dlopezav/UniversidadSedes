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
public class Universidad {

   private String nombre;
   private ArrayList<Sede> sedes;

    public Universidad(String nombre) {
        this.sedes = new ArrayList<>();
    }
   
   public void añadirTecnologico(String nombre, String direccion, int telefono, double AreaConstruida, int estudiantes){
       Sede a= new Tecnologico(nombre,direccion,telefono,AreaConstruida,estudiantes);
       sedes.add(a);
   }
   public void añadirProfesional(int progAltaCalidad, String nombre, String direccion, int telefono, double AreaConstruida){
       Sede b= new Profesional(progAltaCalidad, nombre, direccion, telefono, AreaConstruida);
       sedes.add(b);
   }
    public void añadirEdContinua(String nombre, String direccion, int telefono, double AreaConstruida){
       Sede c= new EducacionContinua(nombre, direccion, telefono, AreaConstruida);
       sedes.add(c);
   }
    public void eliminarSede(String nombre){
        for(Sede e: sedes){
            if(e.nombre.equals(nombre)){
                sedes.remove(e);
            }
        }
    }
}
