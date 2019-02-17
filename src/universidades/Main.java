/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.io.File;
import java.io.*;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dfeli
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Universidad UN= new Universidad("UNAL");
        
        
        int b=0;
        do{
            Scanner a= new Scanner(System.in);
            System.out.println("\n");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Anadir sede");
            System.out.println("2. Modificar sede");
            System.out.println("3. Eliminar sede");
            System.out.println("4. Matricular estudiante");
            try{
            
            b=a.nextInt();
            
            if(b==1){
                int c=0;
                do{
                    System.out.println("\n");
                System.out.println("¿Qué tipo de sede quiere anadir?");
                System.out.println("1. Tecnologica");
                System.out.println("2. Profesional");
                System.out.println("3. Educacion continua");
                c=a.nextInt();
                if(c==1){
                    int d=0;
                    do{
                        String nombre = null;
                        String direccion=null; 
                        int telefono=0;
                        double AreaConstruida=0;
                        int estudiantes=0;
                        System.out.println("Escriba el nombre de la sede:");
                        nombre=a.nextLine();
                        nombre=a.nextLine();
                        System.out.println("Escriba la direccion de la sede:");
                        direccion=a.nextLine();
                        System.out.println("Escriba el telefono de la sede:");
                        telefono=a.nextInt();
                        System.out.println("Escriba el Area Construida:");
                        AreaConstruida=a.nextDouble();
                        System.out.println("Escriba la cantidad de estudiantes:");
                        estudiantes=a.nextInt();
                        
                        
                        UN.añadirTecnologico(nombre, direccion, telefono, AreaConstruida, estudiantes);
                        d=0;
                    }while(d!=0);
                }
                    if(c==2){
                    int d=0;
                    do{
                        String nombre = null;
                        String direccion=null; 
                        int telefono=0;
                        double AreaConstruida=0;
                        int AltaCalidad=0;
                        System.out.println("Escriba el nombre de la sede:");
                        nombre=a.nextLine();
                        nombre=a.nextLine();
                        System.out.println("Escriba la direccion de la sede:");
                        direccion=a.nextLine();
                        System.out.println("Escriba el telefono de la sede:");
                        telefono=a.nextInt();
                        System.out.println("Escriba el Area Construida:");
                        AreaConstruida=a.nextDouble();
                        System.out.println("Escriba la cantidad de programas de alta calidad:");
                        AltaCalidad=a.nextInt();
                        UN.añadirProfesional(AltaCalidad,nombre, direccion, telefono, AreaConstruida);
                        d=0;
                    }while(d!=0);
                }
                    if(c==3){
                    int d=0;
                    do{
                        String nombre = null;
                        String direccion=null; 
                        int telefono=0;
                        double AreaConstruida=0;
                        System.out.println("Escriba el nombre de la sede:");
                        nombre=a.nextLine();
                        nombre=a.nextLine();
                        System.out.println("Escriba la direccion de la sede:");
                        direccion=a.nextLine();
                        System.out.println("Escriba el telefono de la sede:");
                        telefono=a.nextInt();
                        System.out.println("Escriba el Area Construida:");
                        AreaConstruida=a.nextDouble();
                        
                        UN.añadirEdContinua(nombre, direccion, telefono, AreaConstruida);
                        d=0;
                    }while(d!=0);
                }
                }while(c>3||c<1);
            }else if(b==2){
                String nombre=null;
                System.out.println("Ingrese nombre de la sede que quiere modificar: ");
                nombre = a.nextLine();
                for (Iterator<Sede> it = UN.sedes.iterator(); it.hasNext();) {
                    Sede h = it.next();
                    if(h.nombre.equals(nombre)){
                        System.out.println(h.darInformacion());
                        System.out.println("¿Qué desea modificar?");
                    }
                }
            }
            }catch(Exception e){
                System.out.println("No escribio un valor correcto");
            }finally{
                System.out.println("Proceso terminado");
                b=5;
            }
        }while(b>4||b<1);
    }
            
            
}
