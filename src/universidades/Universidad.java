/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dfeli
 */
public class Universidad {

   private String nombre;
   public ArrayList<Sede> sedes;
   private File Profesional;
   private File Tecnologico;
   private File EducacionContinua;
   private PrintStream outputT;
   private PrintStream outputE;
   private PrintStream outputP;

    public Universidad(String nombre) throws FileNotFoundException {
        this.sedes = new ArrayList<>();
        this.Tecnologico = new File("Sedes/Tecnologicos.txt");
        this.EducacionContinua = new File("Sedes/EducacionContinua.txt");
        this.Profesional = new File("Sedes/Profesional.txt");
        this.outputE= new PrintStream(EducacionContinua);
        this.outputP= new PrintStream(Profesional);
        this.outputT= new PrintStream(Tecnologico);
    }
   
   public void añadirTecnologico(String nombre, String direccion, int telefono, double AreaConstruida, int estudiantes){
       Sede a= new Tecnologico(nombre,direccion,telefono,AreaConstruida,estudiantes);
       sedes.add(a);
       outputT.print("\n"+nombre +" " +telefono +" "+ AreaConstruida+ " "+estudiantes);
   }
   public void añadirProfesional(int progAltaCalidad, String nombre, String direccion, int telefono, double AreaConstruida){
       Sede b= new Profesional(progAltaCalidad, nombre, direccion, telefono, AreaConstruida);
       sedes.add(b);
       
       outputP.print("\n"+nombre + " " + telefono +" "+ AreaConstruida+ " "+progAltaCalidad);
   }
    public void añadirEdContinua(String nombre, String direccion, int telefono, double AreaConstruida){
       Sede c= new EducacionContinua(nombre, direccion, telefono, AreaConstruida);
       sedes.add(c);
       outputE.print(" "+ nombre + " " +direccion+" " +telefono +" "+ AreaConstruida);
   }
    public void eliminarSede(String nombre){
        for(Sede e: sedes){
            if(e.nombre.equals(nombre)){
                sedes.remove(e);
            }
        }
    }

    
    
}
